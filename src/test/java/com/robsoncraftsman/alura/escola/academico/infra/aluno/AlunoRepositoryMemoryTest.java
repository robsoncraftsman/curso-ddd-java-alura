package com.robsoncraftsman.alura.escola.academico.infra.aluno;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;

import com.robsoncraftsman.alura.escola.academico.dominio.Cpf;
import com.robsoncraftsman.alura.escola.academico.dominio.aluno.AlunoBuilder;

class AlunoRepositoryMemoryTest {

	private static final String CPF = "123.456.789-00";

	@Test
	void deveMatricularAluno() {
		final var alunoBuilder = new AlunoBuilder();
		final var aluno = alunoBuilder.comNome("João").build();

		final var alunoRepository = new AlunoRepositoryMemory();
		alunoRepository.limparDados();
		alunoRepository.matricular(aluno);

		final var alunos = alunoRepository.buscarTodosAlunosMatriculados();
		assertEquals(1, alunos.size());
		assertEquals("João", alunos.get(0).getNome());
	}

	@Test
	void deveBuscarAlunoPorCpf() {
		final var alunoBuilder = new AlunoBuilder();
		final var aluno = alunoBuilder.comNome("João").comCpf(AlunoRepositoryMemoryTest.CPF).build();

		final var alunoRepository = new AlunoRepositoryMemory();
		alunoRepository.limparDados();
		alunoRepository.matricular(aluno);

		final var alunoEncontrado = alunoRepository.buscarPorCpf(new Cpf(AlunoRepositoryMemoryTest.CPF));
		assertNotNull(alunoEncontrado);
		assertEquals("João", alunoEncontrado.getNome());
		assertEquals(new Cpf(AlunoRepositoryMemoryTest.CPF), alunoEncontrado.getCpf());
	}

	@Test
	void deveBuscarTodosAlunosMatriculados() {
		final var alunoBuilder = new AlunoBuilder();

		final var alunoRepository = new AlunoRepositoryMemory();
		alunoRepository.limparDados();
		alunoRepository.matricular(alunoBuilder.comNome("João").build());
		alunoRepository.matricular(alunoBuilder.comNome("Pedro").build());

		final var alunos = alunoRepository.buscarTodosAlunosMatriculados();
		assertEquals(2, alunos.size());
		assertEquals("João", alunos.get(0).getNome());
		assertEquals("Pedro", alunos.get(1).getNome());
	}

}
