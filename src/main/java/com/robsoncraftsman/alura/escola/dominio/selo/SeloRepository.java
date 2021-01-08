package com.robsoncraftsman.alura.escola.dominio.selo;

import java.util.List;

import com.robsoncraftsman.alura.escola.dominio.Cpf;

public interface SeloRepository {

	void adicionar(Selo selo);

	List<Selo> buscarSelos();

	List<Selo> buscarSelosDoAluno(Cpf cpf);

}
