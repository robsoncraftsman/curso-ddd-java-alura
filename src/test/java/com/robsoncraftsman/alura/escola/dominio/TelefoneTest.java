package com.robsoncraftsman.alura.escola.dominio;

import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

class TelefoneTest {

	@Test
	void naoDevePermitirCriarTelefoneInvalido() {
		assertThrows(IllegalArgumentException.class, () -> {
			new Telefone(null, null);
		});

		assertThrows(IllegalArgumentException.class, () -> {
			new Telefone("", "");
		});

		assertThrows(IllegalArgumentException.class, () -> {
			new Telefone("123", "123");
		});
	}

	@Test
	void devePermitirCriarTelefoneValido() {
		new Telefone("48", "12345678");
		new Telefone("48", "123456789");
	}

}
