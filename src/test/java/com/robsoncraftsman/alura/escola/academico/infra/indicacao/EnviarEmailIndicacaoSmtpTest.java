package com.robsoncraftsman.alura.escola.academico.infra.indicacao;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import com.robsoncraftsman.alura.escola.academico.dominio.aluno.AlunoBuilder;

class EnviarEmailIndicacaoSmtpTest {

	@Test
	void deveEnviarEmail() {
		final var enviarEmailIndicacao = new EnviarEmailIndicacaoSmtp();

		final var alunoBuilder = new AlunoBuilder();
		final var aluno = alunoBuilder.comNome("João").comEmail("joao@email.com").build();

		enviarEmailIndicacao.enviarPara(aluno);

		final var enviados = enviarEmailIndicacao.getEnviados();
		assertEquals(1, enviados.size());
		final var alunoEnviado = enviados.get(0);
		assertEquals("joao@email.com", alunoEnviado.getEmail().getEndereco());
	}

}
