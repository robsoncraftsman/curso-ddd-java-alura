package com.robsoncraftsman.alura.escola.shared.dominio.login;

public interface CifradorSenha {

	String cifrar(String senha);

	boolean validar(String senhaCifrada, String senha);

}
