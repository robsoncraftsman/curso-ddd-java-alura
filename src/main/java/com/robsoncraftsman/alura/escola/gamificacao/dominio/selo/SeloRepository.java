package com.robsoncraftsman.alura.escola.gamificacao.dominio.selo;

import java.util.List;

import com.robsoncraftsman.alura.escola.shared.dominio.Cpf;

public interface SeloRepository {

	void adicionar(Selo selo);

	List<Selo> buscarSelos();

	List<Selo> buscarSelosDoAluno(Cpf cpf);

}
