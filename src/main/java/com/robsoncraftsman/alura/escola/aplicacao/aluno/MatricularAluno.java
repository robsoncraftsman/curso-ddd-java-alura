package com.robsoncraftsman.alura.escola.aplicacao.aluno;

import com.robsoncraftsman.alura.escola.dominio.aluno.AlunoRepository;

public class MatricularAluno {

	private final AlunoRepository alunoRepository;

	public MatricularAluno(final AlunoRepository alunoRepository) {
		this.alunoRepository = alunoRepository;
	}

	public void matricular(final MatricularAlunoDTO dados) {
		final var aluno = dados.criarAluno();

		this.alunoRepository.matricular(aluno);
	}

}
