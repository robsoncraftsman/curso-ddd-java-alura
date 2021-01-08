package com.robsoncraftsman.alura.escola.infra;

public class InfraException extends RuntimeException {

	private static final long serialVersionUID = 1L;

	public InfraException(final String message, final Throwable cause) {
		super(message, cause);
	}

	public InfraException(final String message) {
		super(message);
	}

	public InfraException(final Throwable cause) {
		super(cause);
	}

}
