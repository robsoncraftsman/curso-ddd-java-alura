package com.robsoncraftsman.alura.escola.academico.dominio.aluno;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.robsoncraftsman.alura.escola.shared.dominio.Cpf;
import com.robsoncraftsman.alura.escola.shared.dominio.Email;
import com.robsoncraftsman.alura.escola.shared.dominio.Telefone;
import com.robsoncraftsman.alura.escola.shared.dominio.ValidationException;

public class Aluno {

	private final Cpf cpf;
	private final String nome;
	private final Email email;
	private final String senha;
	private final List<Telefone> telefones = new ArrayList<>();

	public Aluno(final Cpf cpf, final String nome, final Email email, final String senha) {
		this.cpf = cpf;
		this.nome = nome;
		this.email = email;
		this.senha = senha;
	}

	public Cpf getCpf() {
		return this.cpf;
	}

	public String getNome() {
		return this.nome;
	}

	public Email getEmail() {
		return this.email;
	}

	public String getSenha() {
		return this.senha;
	}

	public void addTelefone(final Telefone telefone) {
		if (this.telefones.size() >= 2) {
			throw new ValidationException("Um aluno pode ter no máximo 2 telefones");
		}
		this.telefones.add(telefone);
	}

	public List<Telefone> getTelefones() {
		return Collections.unmodifiableList(this.telefones);
	}

}
