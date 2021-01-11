package com.robsoncraftsman.alura.escola.academico.infra.aluno;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.robsoncraftsman.alura.escola.academico.dominio.aluno.Aluno;
import com.robsoncraftsman.alura.escola.academico.dominio.aluno.AlunoRepository;
import com.robsoncraftsman.alura.escola.shared.dominio.Cpf;

public class AlunoRepositoryMemory implements AlunoRepository {

	private static List<Aluno> alunos = new ArrayList<>();

	@Override
	public void matricular(final Aluno aluno) {
		AlunoRepositoryMemory.alunos.add(aluno);
	}

	@Override
	public Aluno buscarPorCpf(final Cpf cpf) {
		return AlunoRepositoryMemory.alunos.stream()
				.filter(a -> a.getCpf().equals(cpf))
				.findFirst()
				.orElse(null);
	}

	@Override
	public List<Aluno> buscarTodosAlunosMatriculados() {
		return Collections.unmodifiableList(AlunoRepositoryMemory.alunos);
	}

	public void limparDados() {
		AlunoRepositoryMemory.alunos.clear();
	}

}
