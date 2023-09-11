package test;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TestBasics {

	@Test
	void testDefineString() {
		//TODO 1: Declara o variabila de tip String cu numele prenume fara a o initializa cu o valoare
		String prenume = null;
		assertNull(prenume);
	}

	@Test
	void testInitString() {
		//TODO 2: Creeaza o variabila de tip String cu numele prenume si initializeaz-o cu valoarea "Maria"
		String prenume = "Maria";
		assertEquals("Maria", prenume);
	}

	@Test
	void testConcatenation() {
		//TODO 3: Creeaza o variabila cu numele salut si initializeaz-o cu conctatenarea dintre "Hello World " si "Andrei"
		String salut = "Hello World " + "Andrei";
		assertEquals("Hello World Andrei", salut);
	}

	@Test
	void testInteger() {
		//TODO 4: Creaza o variabila de tip Integer numita varsta si atribuie-i valoarea varstei tale
		int varsta = 35;
	}

	@Test
	void testBoolean() {
		//TODO 5: Creaza o variabila de tip boolean cu numele casatorita si atribuie-i valoarea de adevar false
		boolean casatorita = false;
		assertFalse(casatorita);
	}

}
