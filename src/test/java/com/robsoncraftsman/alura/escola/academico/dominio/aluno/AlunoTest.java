package com.robsoncraftsman.alura.escola.academico.dominio.aluno;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

import com.robsoncraftsman.alura.escola.shared.dominio.Telefone;
import com.robsoncraftsman.alura.escola.shared.dominio.ValidationException;

class AlunoTest {

	@Test
	void devePermitirAdicionarUmTelefone() {
		final var alunoBuilder = new AlunoBuilder();
		alunoBuilder.comCpf("111.111.111-11").comEmail("aluno@email.com.br").comNome("João da Silva").comSenha("12345678)").comTelefone("48", "99999999");
		final var aluno = alunoBuilder.build();
		assertEquals(1, aluno.getTelefones().size());
	}

	@Test
	void naoDevePermitirAdicionarMaisQueDoisTelefones() {
		final var alunoBuilder = new AlunoBuilder();
		alunoBuilder.comCpf("111.111.111-11").comEmail("aluno@email.com.br").comNome("João da Silva").comSenha("12345678)").comTelefone("48", "11111111");
		final var aluno = alunoBuilder.build();
		aluno.addTelefone(new Telefone("48", "22222222"));

		final var telefone = new Telefone("48", "33333333");
		assertThrows(ValidationException.class, () -> {
			aluno.addTelefone(telefone);
		});
	}

}
