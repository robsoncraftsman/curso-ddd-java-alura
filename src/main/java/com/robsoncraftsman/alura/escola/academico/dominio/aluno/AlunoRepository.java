package com.robsoncraftsman.alura.escola.academico.dominio.aluno;

import java.util.List;

import com.robsoncraftsman.alura.escola.academico.dominio.Cpf;

public interface AlunoRepository {

	void matricular(Aluno aluno);

	Aluno buscarPorCpf(Cpf cpf);

	List<Aluno> buscarTodosAlunosMatriculados();

}
