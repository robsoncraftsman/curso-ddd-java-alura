package com.robsoncraftsman.alura.escola.dominio.aluno;

import java.util.List;

import com.robsoncraftsman.alura.escola.dominio.Cpf;

public interface AlunoRepository {

	void matricular(Aluno aluno);

	Aluno buscarPorCpf(Cpf cpf);

	List<Aluno> buscarTodosAlunosMatriculados();

}
