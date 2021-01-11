package com.robsoncraftsman.alura.escola.academico.aplicacao.aluno;

import com.robsoncraftsman.alura.escola.academico.dominio.aluno.AlunoRepository;
import com.robsoncraftsman.alura.escola.academico.dominio.aluno.EventoAlunoMatriculado;
import com.robsoncraftsman.alura.escola.shared.dominio.PublicadorEventos;

public class MatricularAluno {

	private final AlunoRepository alunoRepository;
	private final PublicadorEventos publicadorEventos;

	public MatricularAluno(final AlunoRepository alunoRepository, final PublicadorEventos publicadorEventos) {
		this.alunoRepository = alunoRepository;
		this.publicadorEventos = publicadorEventos;
	}

	public void matricular(final MatricularAlunoDTO dados) {
		final var aluno = dados.criarAluno();

		this.alunoRepository.matricular(aluno);

		final var evento = new EventoAlunoMatriculado(aluno.getCpf());
		this.publicadorEventos.publicar(evento);
	}

}
