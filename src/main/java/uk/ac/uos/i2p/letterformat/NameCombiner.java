package uk.ac.uos.i2p.letterformat;

public class NameCombiner {

public String fullName(String foreName, String middleName, String surName) {

String	forenamecap = foreName.substring(0,1).toUpperCase();
String 	forenameletter = forenamecap + foreName.substring(1).toLowerCase();
String	middleInitial = middleName.substring(0,1).toUpperCase();
String	surNamecap = surName.substring(0,1).toUpperCase();
String 	surNameletter = surNamecap + surName.substring(1).toLowerCase();		
	
String letterName = forenameletter + " " + middleInitial + " " + surNameletter;

letterName = letterName.replace("   "," ");

	
	return letterName;
	}

}
