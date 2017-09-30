package dummy_proj_wJunit;

import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

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
	public void testGetHelloWorldString() {
		String helloWorldString = helloWorld.getHelloWorldString();

		assertEquals(helloWorldString, "HelloWorld");
	}
}
