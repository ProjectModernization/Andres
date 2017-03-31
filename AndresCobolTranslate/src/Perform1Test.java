import static org.junit.Assert.*;

import org.junit.Test;

public class Perform1Test {

	@Test
	public void testMultiply() {
	    
		// Test for 2 positive integers
	      assertEquals(2, IterIf.multiply(1, 2));

	      // Test for 1 positive integer and 0
	      assertEquals( 0, IterIf.multiply(3, 0));

	      // Test for 1 positive and 1 negative integer
	      assertEquals(-1, IterIf.multiply(-1, 1));

	      // Test for 2 negative integers
	      assertEquals( 10, IterIf.multiply(-5, -2));

	}
	
	@Test
	public void testSum() {
	    
		// Test for 2 positive integers
	      assertEquals(2, IterIf.sum(1, 1));

	      // Test for 1 positive integer and 0
	      assertEquals( 1, IterIf.sum(1, 0));

	      // Test for 1 positive and 1 negative integer
	      assertEquals(0, IterIf.sum(-1, 1));

	      // Test for 2 negative integers
	      assertEquals( -7, IterIf.sum(-5, -2));

	}

}
