package com.robsoncraftsman.alura.escola.dominio.indicacao;

import java.time.LocalDateTime;

import com.robsoncraftsman.alura.escola.dominio.aluno.Aluno;

public class Indicacao {

	private final Aluno indicante;
	private final Aluno indicado;
	private final LocalDateTime data;

	public Indicacao(final Aluno indicante, final Aluno indicado) {
		this.indicante = indicante;
		this.indicado = indicado;
		this.data = LocalDateTime.now();
	}

	public Aluno getIndicante() {
		return this.indicante;
	}

	public Aluno getIndicado() {
		return this.indicado;
	}

	public LocalDateTime getData() {
		return this.data;
	}

}
