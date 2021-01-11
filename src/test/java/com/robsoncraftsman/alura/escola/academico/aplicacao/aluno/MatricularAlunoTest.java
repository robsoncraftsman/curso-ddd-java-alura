package com.robsoncraftsman.alura.escola.academico.aplicacao.aluno;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import com.robsoncraftsman.alura.escola.academico.infra.aluno.AlunoRepositoryMemory;
import com.robsoncraftsman.alura.escola.shared.dominio.Cpf;
import com.robsoncraftsman.alura.escola.shared.dominio.Email;
import com.robsoncraftsman.alura.escola.shared.dominio.evento.PublicadorEventos;

class MatricularAlunoTest {

	@Test
	void deveMatricularAluno() {
		final var dados = new MatricularAlunoDTO("João", "123.456.789-00", "joao@email.com");

		final var alunoRepository = new AlunoRepositoryMemory();
		alunoRepository.limparDados();

		final var publicadorEventos = new PublicadorEventos();
		final var logAlunoMatriculado = new LogAlunoMatriculado();
		publicadorEventos.adicionar(logAlunoMatriculado);

		final var matricularAluno = new MatricularAluno(alunoRepository, publicadorEventos);
		matricularAluno.matricular(dados);

		final var alunos = alunoRepository.buscarTodosAlunosMatriculados();
		assertEquals(1, alunos.size());

		final var alunoMatriculado = alunos.get(0);
		assertEquals("João", alunoMatriculado.getNome());
		assertEquals(new Cpf("123.456.789-00"), alunoMatriculado.getCpf());
		assertEquals(new Email("joao@email.com"), alunoMatriculado.getEmail());
	}

}
