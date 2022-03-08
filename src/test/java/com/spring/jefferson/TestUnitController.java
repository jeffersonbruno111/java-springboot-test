package com.spring.jefferson;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import com.spring.jefferson.controller.TestController;

public class TestUnitController {

	@Test
	public void testUnit() {
		TestController controller = new TestController();
		String resultado = controller.saudacao("Jefferson");
		assertEquals("Bem vindo, Jefferson", resultado);
	}
}
