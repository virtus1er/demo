package fr.test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class AdditionTest {

	@Test
	public void testCtor() {
		De d = new De();
		assertNotNull(d);
	}

	@Test
	public void testLancer() {
		De d = new De();
		int resultat = d.lancer();
		assertTrue(resultat>0&&resultat<7);
	}

}
