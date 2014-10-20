package ch.ysc.first.test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class StartTest {
	
	@Test
	public void testString() {
		Start obj = new Start();
		assertEquals("Gleicher Text","Hello World !!!",obj.sayHelloWorld());
	}

}
