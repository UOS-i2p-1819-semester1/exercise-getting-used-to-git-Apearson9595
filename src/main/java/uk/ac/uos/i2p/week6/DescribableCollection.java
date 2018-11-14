package uk.ac.uos.i2p.week6;

import java.util.*;

public class DescribableCollection implements Describable {
private List<Describable> mylist=new ArrayList();
//created a list that has generics<> 
//to limit what can held in the list 
//in this case objects that implement describable
//and put it into an Array List (another example of Polymorphism)
//Arraylist is a list, as well as an ArrayList
	@Override public String describe() {
		String finalstring = "[";
		
		for (Describable desc : mylist) {
			finalstring =finalstring + desc.describe() + ",";
	}
		finalstring = finalstring.substring(0, finalstring.length() - 1);
    	finalstring =finalstring + "]";
    	return finalstring;
	}
public void addToCollection (Describable mydescribable) {
	
	mylist.add(mydescribable);
}
}