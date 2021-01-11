package com.robsoncraftsman.alura.escola.academico.dominio.aluno;

import java.time.LocalDateTime;
import java.util.Map;

import com.robsoncraftsman.alura.escola.shared.dominio.Cpf;
import com.robsoncraftsman.alura.escola.shared.dominio.evento.Evento;
import com.robsoncraftsman.alura.escola.shared.dominio.evento.TipoDeEvento;

public class EventoAlunoMatriculado implements Evento {

	private final Cpf cpfDoAluno;
	private final LocalDateTime momento;

	public EventoAlunoMatriculado(final Cpf cpfDoAluno) {
		this.cpfDoAluno = cpfDoAluno;
		this.momento = LocalDateTime.now();
	}

	public Cpf getCpfDoAluno() {
		return this.cpfDoAluno;
	}

	@Override
	public LocalDateTime momento() {
		return this.momento;
	}

	@Override
	public TipoDeEvento tipo() {
		return TipoDeEvento.ALUNO_MATRICULADO;
	}

	@Override
	public Map<String, Object> informacoes() {
		return Map.of("cpf", getCpfDoAluno());
	}

}
