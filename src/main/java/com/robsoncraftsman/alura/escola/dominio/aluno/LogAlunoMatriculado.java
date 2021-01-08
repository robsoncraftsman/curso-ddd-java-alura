package com.robsoncraftsman.alura.escola.dominio.aluno;

import java.time.format.DateTimeFormatter;
import java.util.logging.Logger;

import com.robsoncraftsman.alura.escola.dominio.Evento;
import com.robsoncraftsman.alura.escola.dominio.Ouvinte;

public class LogAlunoMatriculado extends Ouvinte {

	private static final Logger LOGGER = Logger.getLogger("LogAlunoMatriculado");

	@Override
	protected boolean deveProcessarEvento(final Evento evento) {
		return (evento instanceof EventoAlunoMatriculado);
	}

	@Override
	public void reageAo(final Evento evento) {
		final var eventoAlunoMatriculado = (EventoAlunoMatriculado) evento;
		final var momentoFormatado = evento.momento().format(DateTimeFormatter.ofPattern("dd/MM/yyyy HH:MM"));
		final var log = String.format("Aluno com CPF '%s' matriculado em '%s'.", eventoAlunoMatriculado.getCpfDoAluno(), momentoFormatado);
		LOGGER.info(log);
	}

}
