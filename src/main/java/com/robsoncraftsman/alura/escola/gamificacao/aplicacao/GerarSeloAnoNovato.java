package com.robsoncraftsman.alura.escola.gamificacao.aplicacao;

import com.robsoncraftsman.alura.escola.gamificacao.dominio.selo.Selo;
import com.robsoncraftsman.alura.escola.gamificacao.dominio.selo.SeloRepository;
import com.robsoncraftsman.alura.escola.shared.dominio.Cpf;
import com.robsoncraftsman.alura.escola.shared.dominio.evento.Evento;
import com.robsoncraftsman.alura.escola.shared.dominio.evento.Ouvinte;
import com.robsoncraftsman.alura.escola.shared.dominio.evento.TipoDeEvento;

public class GerarSeloAnoNovato extends Ouvinte {

	private final SeloRepository seloRepository;

	public GerarSeloAnoNovato(final SeloRepository seloRepository) {
		this.seloRepository = seloRepository;
	}

	@Override
	protected boolean deveProcessarEvento(final Evento evento) {
		return evento.tipo() == TipoDeEvento.ALUNO_MATRICULADO;
	}

	@Override
	protected void reageAo(final Evento evento) {
		final var cpf = (Cpf) evento.informacoes().get("cpf");
		final var seloNovato = new Selo(cpf, "Novato");

		this.seloRepository.adicionar(seloNovato);
	}

}
