package com.robsoncraftsman.alura.escola.gamificacao.infra.selo;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import com.robsoncraftsman.alura.escola.gamificacao.dominio.selo.Selo;
import com.robsoncraftsman.alura.escola.shared.dominio.Cpf;

class SeloRepositoryMemoryTest {

	@Test
	void deveCriarSelo() {
		final var selo = new Selo(new Cpf("111.111.111-11"), "Campeão");

		final var seloRepository = new SeloRepositoryMemory();
		seloRepository.adicionar(selo);

		final var selos = seloRepository.buscarSelos();
		assertEquals(1, selos.size());
		final var seloSalvo = selos.get(0);
		assertEquals("111.111.111-11", seloSalvo.getCpf().getValor());
		assertEquals("Campeão", seloSalvo.getNome());
	}

	@Test
	void deveBuscarSelosDoAluno() {
		final var seloUm = new Selo(new Cpf("111.111.111-11"), "Master");
		final var seloDois = new Selo(new Cpf("222.222.222-22"), "Top");

		final var seloRepository = new SeloRepositoryMemory();
		seloRepository.adicionar(seloUm);
		seloRepository.adicionar(seloDois);

		final var selosDoAluno = seloRepository.buscarSelosDoAluno(new Cpf("222.222.222-22"));
		assertEquals(1, selosDoAluno.size());
		final var selo = selosDoAluno.get(0);
		assertEquals("222.222.222-22", selo.getCpf().getValor());
		assertEquals("Top", selo.getNome());
	}

}
