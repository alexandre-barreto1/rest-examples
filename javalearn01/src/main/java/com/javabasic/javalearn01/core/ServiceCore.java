package com.javabasic.javalearn01.core;

import org.omg.CORBA.portable.ApplicationException;

public class ServiceCore {

	public static final int _LIMIT = 100;

	/**
	 * Esse metodo verifica se o value informado é maior que 100, se não for uma
	 * exceção vai ser lançada.
	 * 
	 * @param value
	 * @throws ApplicationException
	 * @throws Exception
	 */
	public void checkForCorrectValue(Integer value) throws Exception {

		// Regra de negocio.
		if (value < _LIMIT) {

			String message = "O valor informado é invalido, somente é aceito valor maior que 100";
			throw new Exception(message);
		}

	}
}
