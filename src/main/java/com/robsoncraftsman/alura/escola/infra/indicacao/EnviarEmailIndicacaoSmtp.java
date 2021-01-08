package com.robsoncraftsman.alura.escola.infra.indicacao;

import com.robsoncraftsman.alura.escola.aplicacao.indicacao.EnviarEmailIndicacao;
import com.robsoncraftsman.alura.escola.dominio.aluno.Aluno;

public class EnviarEmailIndicacaoSmtp implements EnviarEmailIndicacao {

	@Override
	public void enviarPara(final Aluno indicado) {
		System.out.println(String.format("Enviando e-mail para %s", indicado.getEmail()));
	}

}
