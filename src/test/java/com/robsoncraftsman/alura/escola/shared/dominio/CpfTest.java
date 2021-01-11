package com.robsoncraftsman.alura.escola.shared.dominio;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

class CpfTest {

	@Test
	void naoDeveCriarCpfComNumeroInvalido() {
		assertThrows(IllegalArgumentException.class, () -> {
			new Cpf(null);
		});

		assertThrows(IllegalArgumentException.class, () -> {
			new Cpf("");
		});

		assertThrows(IllegalArgumentException.class, () -> {
			new Cpf("1234578990");
		});
	}

	@Test
	void deveCriarCpfComNumeroValido() {
		final var cpf = new Cpf("000.000.000-00");
		assertEquals("000.000.000-00", cpf.getValor());
	}

}
