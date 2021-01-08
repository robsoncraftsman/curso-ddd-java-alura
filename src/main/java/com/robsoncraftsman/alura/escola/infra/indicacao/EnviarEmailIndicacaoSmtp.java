package com.robsoncraftsman.alura.escola.infra.indicacao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.logging.Logger;

import com.robsoncraftsman.alura.escola.aplicacao.indicacao.EnviarEmailIndicacao;
import com.robsoncraftsman.alura.escola.dominio.aluno.Aluno;

public class EnviarEmailIndicacaoSmtp implements EnviarEmailIndicacao {

	private static final Logger LOGGER = Logger.getLogger("EmailIndicacao");

	private List<Aluno> enviados = new ArrayList<>();

	@Override
	public void enviarPara(final Aluno indicado) {
		final var log = String.format("Enviando e-mail para %s", indicado.getEmail());
		LOGGER.info(log);
		this.enviados.add(indicado);
	}

	public List<Aluno> getEnviados() {
		return Collections.unmodifiableList(this.enviados);
	}

}
