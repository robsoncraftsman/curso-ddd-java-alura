package com.robsoncraftsman.alura.escola.academico.dominio;

import static org.junit.jupiter.api.Assertions.assertEquals;
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
	void devePermitirCriarTelefoneComOitoDigitos() {
		final var telefone = new Telefone("48", "12345678");
		assertEquals("48", telefone.getDdd());
		assertEquals("12345678", telefone.getNumero());
	}

	@Test
	void devePermitirCriarTelefoneValido() {
		final var telefone = new Telefone("48", "123456789");
		assertEquals("48", telefone.getDdd());
		assertEquals("123456789", telefone.getNumero());
	}

}
