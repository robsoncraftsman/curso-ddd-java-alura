package com.robsoncraftsman.alura.escola.shared.dominio;

public abstract class Ouvinte {

	public void processa(final Evento evento) {
		if (deveProcessarEvento(evento)) {
			reageAo(evento);
		}
	}

	protected abstract boolean deveProcessarEvento(Evento evento);

	protected abstract void reageAo(Evento evento);

}
