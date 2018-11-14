package uk.ac.uos.i2p.week6;

public class Number implements Describable {
private int value;
// private double is a field which is a number
	
	public Number (int newValue) {
	value = newValue;	
	}
//constructor creator to allow the class to be more adaptable and be implemented with any double value	
	@Override public String describe() {
		
		return Integer.toString(value);
		
	}

}