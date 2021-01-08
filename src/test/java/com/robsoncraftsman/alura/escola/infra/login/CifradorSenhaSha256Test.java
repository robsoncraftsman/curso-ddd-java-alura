package com.robsoncraftsman.alura.escola.infra.login;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

class CifradorSenhaSha256Test {

	private static final String HASHED_PASSWORD = "hmCuArTr9WMuLOUSz6hDQHNCmO/EyuMkRjFGhxgrR4Q=";

	@Test
	void deveCifrarSenha() {
		final var cifrador = new CifradorSenhaSha256();
		final var senhaCifrada = cifrador.cifrar("123");
		assertEquals(HASHED_PASSWORD, senhaCifrada);
	}

	@Test
	void deveValidarSenha() {
		final var cifrador = new CifradorSenhaSha256();
		assertTrue(cifrador.validar(HASHED_PASSWORD, "123"));
	}

}
