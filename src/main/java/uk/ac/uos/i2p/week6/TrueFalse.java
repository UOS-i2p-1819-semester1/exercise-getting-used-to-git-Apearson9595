package uk.ac.uos.i2p.week6;

public class TrueFalse implements Describe {

	@Override public String describe() {
		
		int x = 10;
		boolean y = x == 10;
		
		String str = String.valueOf(y);
		
		return str;
	}

}
