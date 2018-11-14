package uk.ac.uos.i2p.week6;

public class Text implements Describable {
private String myText;

public Text (String newText) {
	myText = newText;
}
@Override public String describe() {
			
			return "\""+myText+"\"";
			
		}
	}
