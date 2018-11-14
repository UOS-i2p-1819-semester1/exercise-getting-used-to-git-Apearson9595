package week6test;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import uk.ac.uos.i2p.week6.Text;
import uk.ac.uos.i2p.week6.Number;
import uk.ac.uos.i2p.week6.TrueFalse;
import uk.ac.uos.i2p.week6.Novalue;
import uk.ac.uos.i2p.week6.DescribableCollection;
import uk.ac.uos.i2p.week6.DescribableProcessor;

import org.junit.jupiter.api.Test;



class week6test {

	@Test
	void test() {
		
		Text textTest = new Text("I got this");
		String output = textTest.describe();
		assertEquals ("\"I got this\"", output);
	}
	@Test
	void test2() {
		
		Number numberTest = new Number(1);
		String output = numberTest.describe();
		assertEquals("1", output);
	}
	@Test
	void test3() {
		
		TrueFalse boolTest = new TrueFalse(true);
		String output = boolTest.describe();
		assertEquals("true", output);
	}
	@Test
	void test4() {
		
		Novalue nulTest = new Novalue();
		String output = nulTest.describe();
		assertEquals("null", output);
	}
	
	@Test
	void test5() {
		
		DescribableCollection coltest = new DescribableCollection();
		Number numberTest1 = new Number(1);
		Number numberTest2 = new Number(2);
		Text textTest = new Text("hello");
		Novalue nulTest = new Novalue();
		TrueFalse boolTest = new TrueFalse(false);
		coltest.addToCollection(numberTest1);
		coltest.addToCollection(numberTest2);
		coltest.addToCollection(textTest);
		coltest.addToCollection(nulTest);
		coltest.addToCollection(boolTest);
		String output = coltest.describe();
		System.out.println(output);
		assertEquals("[1,2,\"hello\",null,false]", output);
	}
	@Test
	void test6() throws IOException {
		
		DescribableProcessor ItTest = new DescribableProcessor();
		List<String> it=new ArrayList();
		//a list implements Iterable (can be converted to an Iterator)
		it.add("hello");
		ItTest.process(it.iterator());
	}
}
