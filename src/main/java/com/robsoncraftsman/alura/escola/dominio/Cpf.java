package com.robsoncraftsman.alura.escola.dominio;

import java.util.Objects;

public class Cpf {

	private final String valor;

	public Cpf(final String valor) {
		if ((valor == null) || !valor.matches("^\\d{3}\\.\\d{3}\\.\\d{3}\\-\\d{2}$")) {
			throw new IllegalArgumentException(String.format("%s não é um CPF válido.", valor));
		}
		this.valor = valor;
	}

	public String getValor() {
		return this.valor;
	}

	@Override
	public int hashCode() {
		final var prime = 31;
		var result = 1;
		result = (prime * result) + ((this.valor == null) ? 0 : this.valor.hashCode());
		return result;
	}

	@Override
	public boolean equals(final Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (getClass() != obj.getClass()) {
			return false;
		}
		final var other = (Cpf) obj;
		if (!Objects.equals(this.valor, other.valor)) {
			return false;
		}
		return true;
	}

}
