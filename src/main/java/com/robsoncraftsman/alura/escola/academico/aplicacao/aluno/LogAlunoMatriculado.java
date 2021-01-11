package com.robsoncraftsman.alura.escola.academico.aplicacao.aluno;

import java.time.format.DateTimeFormatter;
import java.util.logging.Logger;

import com.robsoncraftsman.alura.escola.academico.dominio.aluno.EventoAlunoMatriculado;
import com.robsoncraftsman.alura.escola.shared.dominio.evento.Evento;
import com.robsoncraftsman.alura.escola.shared.dominio.evento.Ouvinte;
import com.robsoncraftsman.alura.escola.shared.dominio.evento.TipoDeEvento;

public class LogAlunoMatriculado extends Ouvinte {

	private static final Logger LOGGER = Logger.getLogger("LogAlunoMatriculado");

	@Override
	protected boolean deveProcessarEvento(final Evento evento) {
		return evento.tipo() == TipoDeEvento.ALUNO_MATRICULADO;
	}

	@Override
	public void reageAo(final Evento evento) {
		final var eventoAlunoMatriculado = (EventoAlunoMatriculado) evento;
		final var momentoFormatado = evento.momento().format(DateTimeFormatter.ofPattern("dd/MM/yyyy HH:MM"));
		final var log = String.format("Aluno com CPF '%s' matriculado em '%s'.", eventoAlunoMatriculado.getCpfDoAluno(), momentoFormatado);
		LogAlunoMatriculado.LOGGER.info(log);
	}

}
