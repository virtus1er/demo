/**
 * 
 */
package fr.test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * @author sylvain
 *
 */
public class Atest {

	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
	}

	/**
	 * @throws java.lang.Exception
	 */
	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() {
		fail("Not yet implemented");
	}

	@Test
	public void testLireSymbole() throws Exception {
		assertEquals((Character) '+', op.lireSymbole());
	}

}
