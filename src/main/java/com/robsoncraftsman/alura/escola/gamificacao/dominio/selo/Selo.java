package com.robsoncraftsman.alura.escola.gamificacao.dominio.selo;

import com.robsoncraftsman.alura.escola.academico.dominio.Cpf;

public class Selo {

	private Cpf cpf;
	private String nome;

	public Selo(final Cpf cpf, final String nome) {
		this.cpf = cpf;
		this.nome = nome;
	}

	public Cpf getCpf() {
		return this.cpf;
	}

	public String getNome() {
		return this.nome;
	}

}
