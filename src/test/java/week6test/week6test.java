package week6test;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import uk.ac.uos.i2p.week6.Text;
import org.junit.jupiter.api.Test;

class week6test {

	@Test
	void test() {
		
		Text textTest = new Text();
		String output = textTest.describe();
		assertEquals("\"I got this\"", output);
	}

}
