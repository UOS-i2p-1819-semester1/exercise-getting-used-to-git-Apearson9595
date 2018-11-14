package uk.ac.uos.i2p.week6;

public class TrueFalse implements Describable {
private boolean myBoolean;

public TrueFalse (boolean value) {
	myBoolean = value;
}
@Override public String describe() {
		
		return Boolean.toString(myBoolean);
	}

}
