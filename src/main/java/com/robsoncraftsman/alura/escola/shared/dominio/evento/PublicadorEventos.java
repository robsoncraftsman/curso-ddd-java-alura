package com.robsoncraftsman.alura.escola.shared.dominio.evento;

import java.util.ArrayList;
import java.util.List;

public class PublicadorEventos {

	private List<Ouvinte> ouvintes = new ArrayList<>();

	public void adicionar(final Ouvinte ouvinte) {
		this.ouvintes.add(ouvinte);
	}

	public void publicar(final Evento evento) {
		this.ouvintes.forEach(o -> o.processa(evento));
	}

}
