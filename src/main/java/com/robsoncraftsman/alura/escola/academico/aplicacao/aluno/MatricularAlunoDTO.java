package com.robsoncraftsman.alura.escola.academico.aplicacao.aluno;

import com.robsoncraftsman.alura.escola.academico.dominio.aluno.Aluno;
import com.robsoncraftsman.alura.escola.academico.dominio.aluno.AlunoBuilder;

public class MatricularAlunoDTO {

	private final String nome;
	private final String cpf;
	private final String email;

	public MatricularAlunoDTO(final String nome, final String cpf, final String email) {
		this.nome = nome;
		this.cpf = cpf;
		this.email = email;
	}

	public Aluno criarAluno() {
		final var alunoBuilder = new AlunoBuilder();
		return alunoBuilder.comNome(this.nome).comCpf(this.cpf).comEmail(this.email).build();
	}

}
