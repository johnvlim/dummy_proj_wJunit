package dummy_proj_wJunit;

import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;

public class HelloWorldTest {
	private static HelloWorld helloWorld;

	public HelloWorld getHelloWorld() {
		return helloWorld;
	}

	public void setHelloWorld(HelloWorld helloWorld) {
		HelloWorldTest.helloWorld = helloWorld;
	}

	@BeforeClass
	public static void initHelloWorld() {
		helloWorld = new HelloWorld();
	}

	@Test
	public void test_getHelloWorld_notNull() {
		assertNotNull(getHelloWorld());
	}

	/*
	 * demo (begin)
	 *//*
		 * @Test public void test_getHelloWorld_null() {
		 * assertNull(getHelloWorld()); }
		 */
	/*
	 * demo (end)
	 */

	@Test
	public void test_getHelloWorldString_equals_HelloWorld() {
		String helloWorldString = helloWorld.getHelloWorldString();

		assertEquals(helloWorldString, "HelloWorld");
	}
}
