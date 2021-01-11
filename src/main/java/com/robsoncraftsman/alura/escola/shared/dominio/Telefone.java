package com.robsoncraftsman.alura.escola.shared.dominio;

public class Telefone {

	private final String ddd;
	private final String numero;

	public Telefone(final String ddd, final String numero) {
		if ((ddd == null) || (numero == null)) {
			throw new IllegalArgumentException("DDD e Número do telefone são obrigatórios.");
		}

		if (!ddd.matches("\\d{2}")) {
			throw new IllegalArgumentException("DDD deve possuir dois dígitos");
		}

		if (!numero.matches("\\d{8}|\\d{9}")) {
			throw new IllegalArgumentException(
				"Número deve possuir oitro ou nove dígitos e não pode ter caracteres especiais");
		}

		this.ddd = ddd;
		this.numero = numero;
	}

	public String getDdd() {
		return this.ddd;
	}

	public String getNumero() {
		return this.numero;
	}

}
