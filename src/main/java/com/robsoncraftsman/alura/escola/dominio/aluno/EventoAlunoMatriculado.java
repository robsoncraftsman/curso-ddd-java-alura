package com.robsoncraftsman.alura.escola.dominio.aluno;

import java.time.LocalDateTime;

import com.robsoncraftsman.alura.escola.dominio.Cpf;
import com.robsoncraftsman.alura.escola.dominio.Evento;

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

}
