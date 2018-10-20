package test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import uk.ac.uos.i2p.letterformat.NameCombiner;

class NameCombinerTest {

	@Test
	// test that if no middle name the additional space is removed
	void test() {
		NameCombiner nc = new NameCombiner();
		assertEquals("Andrew Pearson", nc.fullName("AndreW", " ", "PeaRsoN"));
					
	}

	@Test
	// test that middle name is shortened to first initial and correct format
	void test1() {
		NameCombiner nc = new NameCombiner();
		assertEquals("Andrew M Pearson", nc.fullName("Andrew", "Mark", "Pearson"));
					
	}
	
	@Test
	// test that case is formatted correctly
	void test2() {
		NameCombiner nc = new NameCombiner();
		assertEquals("Andrew M Pearson", nc.fullName("ANDREW", "mArK", "peaRsoN"));
					
	}
	
	@Test
	// test format of double barrelled surname
	void test5() {
		NameCombiner nc = new NameCombiner();
		assertEquals("Andrew Pearson", nc.fullName("ANDREW", null, "pearson"));
	}
	
	@Test
	// test format of double barrelled surname
	void test6() {
		NameCombiner nc = new NameCombiner();
		assertEquals("Forename required", nc.fullName(null, "Mark", "pearson"));
	}
}