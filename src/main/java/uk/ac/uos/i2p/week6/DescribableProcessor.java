package uk.ac.uos.i2p.week6;

import java.io.IOException;
import java.util.Iterator;

public class DescribableProcessor implements Processor {

	@Override
	public void process(Iterator<String> it) throws IOException {
		// TODO Auto-generated method stub
		while (it.hasNext()) {
			String next =it.next();
			Text text = new Text (next);
			System.out.println(text.describe());
		}
	}
}

