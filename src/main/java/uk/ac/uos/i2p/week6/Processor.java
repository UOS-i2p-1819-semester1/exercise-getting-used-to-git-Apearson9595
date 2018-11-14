package uk.ac.uos.i2p.week6;

import java.io.IOException;
import java.util.Iterator;

public interface Processor {
	void process(Iterator<String>it) throws IOException;
//Iterator needs to be given a group of Strings that are iterable
//Can be used with Intergers or Interfaces. 
}
