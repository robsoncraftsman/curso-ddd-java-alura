package com.robsoncraftsman.alura.escola.infra.aluno;

import java.util.ArrayList;
import java.util.List;

import com.robsoncraftsman.alura.escola.dominio.Cpf;
import com.robsoncraftsman.alura.escola.dominio.aluno.Aluno;
import com.robsoncraftsman.alura.escola.dominio.aluno.AlunoRepository;

public class AlunoRepositoryMemory implements AlunoRepository {

	private static List<Aluno> alunos = new ArrayList<>();

	@Override
	public void matricular(final Aluno aluno) {
		alunos.add(aluno);
	}

	@Override
	public Aluno buscarPorCpf(final Cpf cpf) {
		return alunos.stream()
				.filter(a -> a.getCpf().equals(cpf))
				.findFirst()
				.orElse(null);
	}

	@Override
	public List<Aluno> buscarTodosAlunosMatriculados() {
		return AlunoRepositoryMemory.alunos;
	}

	public void limparDados() {
		alunos.clear();
	}

}
