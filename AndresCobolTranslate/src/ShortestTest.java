import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.OutputStream;
import java.io.PrintStream;

import org.junit.Test;

public class ShortestTest {

	@Test
	public void printtest() {
		 OutputStream outContent = new ByteArrayOutputStream();
	      System.setOut(new PrintStream(outContent));
	      
	      String expectedOutput = "I did it";
	      System.out.print("I did it");
	      assertEquals(expectedOutput, outContent.toString());
	      
	}

}
