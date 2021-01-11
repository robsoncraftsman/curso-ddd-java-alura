package com.robsoncraftsman.alura.escola.academico.infra.login;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Base64;

import com.robsoncraftsman.alura.escola.academico.dominio.login.CifradorSenha;
import com.robsoncraftsman.alura.escola.academico.infra.InfraException;

public class CifradorSenhaSha256 implements CifradorSenha {

	private static final String SALT = "MEU_SALT";

	@Override
	public String cifrar(final String senha) {
		try {
			final var md = MessageDigest.getInstance("SHA-256");
			md.update(SALT.getBytes());

			final var hashedPassword = md.digest(senha.getBytes(StandardCharsets.UTF_8));
			return Base64.getEncoder().encodeToString(hashedPassword);
		} catch (final NoSuchAlgorithmException nsae) {
			throw new InfraException(nsae);
		}
	}

	@Override
	public boolean validar(final String senhaCifrada, final String senha) {
		return (senhaCifrada != null) && (senha != null) && senhaCifrada.equals(cifrar(senha));
	}

}
