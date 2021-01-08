package com.robsoncraftsman.alura.escola.dominio;

import java.util.Objects;

public class Email {

	private final String endereco;

	public Email(final String endereco) {
		if ((endereco == null) || (!endereco.matches("^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$"))) {
			throw new IllegalArgumentException(String.format("%s não é um email válido.", endereco));
		}
		this.endereco = endereco;
	}

	public String getEndereco() {
		return this.endereco;
	}

	@Override
	public String toString() {
		return this.endereco;
	}

	@Override
	public int hashCode() {
		final var prime = 31;
		var result = 1;
		result = (prime * result) + ((this.endereco == null) ? 0 : this.endereco.hashCode());
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
		final var other = (Email) obj;
		if (!Objects.equals(this.endereco, other.endereco)) {
			return false;
		}
		return true;
	}

}
