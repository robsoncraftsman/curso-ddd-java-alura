package com.robsoncraftsman.alura.escola.academico.dominio.aluno;

import java.util.ArrayList;
import java.util.List;

import com.robsoncraftsman.alura.escola.shared.dominio.Cpf;
import com.robsoncraftsman.alura.escola.shared.dominio.Email;
import com.robsoncraftsman.alura.escola.shared.dominio.Telefone;

public class AlunoBuilder {

	private String nome;
	private Cpf cpf;
	private Email email;
	private String senha;
	private final List<Telefone> telefones = new ArrayList<>();

	public AlunoBuilder comNome(final String nome) {
		this.nome = nome;
		return this;
	}

	public AlunoBuilder comCpf(final String cpf) {
		this.cpf = new Cpf(cpf);
		return this;
	}

	public AlunoBuilder comEmail(final String email) {
		this.email = new Email(email);
		return this;
	}

	public AlunoBuilder comSenha(final String senha) {
		this.senha = senha;
		return this;
	}

	public AlunoBuilder comTelefone(final String ddd, final String numero) {
		this.telefones.add(new Telefone(ddd, numero));
		return this;
	}

	public Aluno build() {
		final var aluno = new Aluno(this.cpf, this.nome, this.email, this.senha);
		this.telefones.stream().forEach(aluno::addTelefone);
		return aluno;
	}

}
