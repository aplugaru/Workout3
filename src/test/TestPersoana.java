package test;

import static org.junit.jupiter.api.Assertions.*;

import main.Main;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import main.Persoana;

class TestPersoana {

	static Persoana persoana;

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		persoana = new Persoana("Popescu ", "Ion-Andrei ", "Cluj ", 40 , true, "JAVA");
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	@Test
	void testName() {
		assertEquals("Popescu ", persoana.getNume());
	}

	@Test
	void testPrenume() {
		assertEquals("Ion-Andrei ", persoana.getPrenume());
	}
	
	@Test
	void testOras() {
		assertEquals("Cluj ", persoana.getOras());
	}
	
	@Test
	void testVarsta() {
		persoana.setVarsta(40);
		assertEquals(40, persoana.getVarsta());
	}
	
	@Test
	void testCasatorita() {
        assertTrue(persoana.getisCasatorita());
	}
	
	@Test
	void testToString() {
		String expectedToString = "Persoana [nume=Popescu , prenume=Ion-Andrei , oras=Cluj , varsta=40 , casatorita=true, curs=JAVA ]";
		assertEquals(expectedToString, persoana.toString());
	}
	

	@Test
	void testCreste() {
		persoana.creste();
		assertEquals(40, persoana.getVarsta());
	}
	
	@Test
	void testObtineIdentificator() {
		String expectedIdentificator = "Popescu Ion-Andrei ";
		assertEquals(expectedIdentificator, Persoana.obtineIdentificator());
	}
	
	@Test
	void testCurs() {
		Persoana.curs = "JAVA";
		assertEquals("JAVA", Persoana.curs);
	}
	
	@Test
	void testEmptyConstructor() {
		Persoana emptyPerson = new Persoana();
		assertNotNull(emptyPerson);
	}

	
}
