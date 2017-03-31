import static org.junit.Assert.*;

import org.junit.Test;

public class MultiplierTest {

	@Test
	public void testMultiply() {
		Multiplier multiplier = new Multiplier();
	    
		// Test for 2 positive integers
	      assertEquals(2, multiplier.multiply(1, 2));

	      // Test for 1 positive integer and 0
	      assertEquals( 0, multiplier.multiply(3, 0));

	      // Test for 1 positive and 1 negative integer
	      assertEquals(-1, multiplier.multiply(-1, 1));

	      // Test for 2 negative integers
	      assertEquals( 10, multiplier.multiply(-5, -2));

	}

}
