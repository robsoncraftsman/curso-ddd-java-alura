package com.robsoncraftsman.alura.escola.shared.dominio;

public class ValidationException extends RuntimeException {

	private static final long serialVersionUID = 1L;

	public ValidationException(final String message) {
		super(message);
	}

}
