package com.robsoncraftsman.alura.escola.dominio;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

class EmailTest {

	@Test
	void naoDeveCriarEmailComEnderecoInvalido() {
		assertThrows(IllegalArgumentException.class, () -> {
			new Email(null);
		});

		assertThrows(IllegalArgumentException.class, () -> {
			new Email("");
		});

		assertThrows(IllegalArgumentException.class, () -> {
			new Email("invalido");
		});

		assertThrows(IllegalArgumentException.class, () -> {
			new Email("@");
		});

		assertThrows(IllegalArgumentException.class, () -> {
			new Email("@invalido");
		});

		assertThrows(IllegalArgumentException.class, () -> {
			new Email("invalido@");
		});
	}

	@Test
	void deveCriarEmailComEnderecoValido() {
		final var email = new Email("teste@email.com");
		assertEquals("teste@email.com", email.getEndereco());
	}

}
