package com.mycityaz.exception;

public class NoSuchIdFound extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	String msg;

	public NoSuchIdFound(String msg) {
		super(msg);

	}

}
