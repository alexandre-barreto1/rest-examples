package com.javabasic.javalearn01.model;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;

import org.junit.Test;

import com.javabasic.javalearn01.core.ServiceCore;

public class ServiceCoreTest {

	@Test
	public void testInvalid() {
		Exception erro = null;
		ServiceCore serviceCore = new ServiceCore();
		try {
			serviceCore.checkForCorrectValue(99);
		} catch (Exception e) {
			erro = e;
		}

		assertNotNull("erro", erro);
		assertEquals(
				"erro ",
				"O valor informado é invalido, somente é aceito valor maior que 100",
				erro.getMessage());
	}

	@Test
	public void testValid() {
		Exception erro = null;
		ServiceCore serviceCore = new ServiceCore();
		try {
			serviceCore.checkForCorrectValue(102);
		} catch (Exception e) {
			erro = e;
		}

		assertNull("erro", erro);

	}

}
