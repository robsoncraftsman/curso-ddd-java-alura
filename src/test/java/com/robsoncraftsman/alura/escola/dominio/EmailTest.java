package com.robsoncraftsman.alura.escola.dominio;

import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

public class EmailTest {

	@Test
	public void naoDeveCriarEmailComEnderecoInvalido() {
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
	public void deveCriarEmailComEnderecoValido() {
		new Email("teste@email.com");
	}

}
