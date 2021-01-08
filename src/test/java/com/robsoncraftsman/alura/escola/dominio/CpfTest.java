package com.robsoncraftsman.alura.escola.dominio;

import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

public class CpfTest {

	@Test
	public void naoDeveCriarCpfComNumeroInvalido() {
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
	public void deveCriarCpfComNumeroValido() {
		new Cpf("000.000.000-00");
	}

}
