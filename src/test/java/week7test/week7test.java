package week7test;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import uk.ac.uos.i2p.week6.Text;

class week7test {

	@Test
	void test() {
		fail("Not yet implemented");
	}

}

@Test
void test() {
	
	Text textTest = new Text();
	String output = textTest.describe();
	assertEquals ("\"I got this\"", output);
}