package com.robsoncraftsman.alura.escola.gamificacao.infra.selo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

import com.robsoncraftsman.alura.escola.academico.dominio.Cpf;
import com.robsoncraftsman.alura.escola.gamificacao.dominio.selo.Selo;
import com.robsoncraftsman.alura.escola.gamificacao.dominio.selo.SeloRepository;

public class SeloRepositoryMemory implements SeloRepository {

	private static List<Selo> selos = new ArrayList<>();

	@Override
	public void adicionar(final Selo selo) {
		SeloRepositoryMemory.selos.add(selo);
	}

	@Override
	public List<Selo> buscarSelos() {
		return Collections.unmodifiableList(SeloRepositoryMemory.selos);
	}

	public void limparDados() {
		SeloRepositoryMemory.selos.clear();
	}

	@Override
	public List<Selo> buscarSelosDoAluno(final Cpf cpf) {
		return SeloRepositoryMemory.selos.stream().filter(s -> s.getCpf().equals(cpf)).collect(Collectors.toList());
	}

}
