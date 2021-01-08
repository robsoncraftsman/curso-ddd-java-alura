package com.robsoncraftsman.alura.escola.infra.indicacao;

import org.junit.jupiter.api.Test;

import com.robsoncraftsman.alura.escola.dominio.aluno.AlunoBuilder;

class EnviarEmailIndicacaoSmtpTest {

	@Test
	void deveEnviarEmail() {
		final var enviarEmailIndicacao = new EnviarEmailIndicacaoSmtp();

		final var alunoBuilder = new AlunoBuilder();
		final var aluno = alunoBuilder.comNome("João").comEmail("joao@email.com").build();

		enviarEmailIndicacao.enviarPara(aluno);
	}

}
