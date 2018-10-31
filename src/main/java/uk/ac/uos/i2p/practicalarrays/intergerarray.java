package uk.ac.uos.i2p.practicalarrays;

import java.util.*;

public class intergerarray {

	
	public static void main(String[] args) {

		int[] num ={17, 89, 27, 11, 91, 42, 73, 90, 5, 5 };
		Arrays.sort(num);
		
		int mean = mean(num);
		int minimum = minimum(num);
		int maximum = maximum(num);
		int range = range(minimum, maximum);
		double standarddeviation = sdarray(minimum, maximum, mean, range);
		
		System.out.println("minimum = " + minimum);
		System.out.println("Maximum = " + maximum); 
		System.out.println("range = " + range);
		System.out.println("mean = " + mean);
		System.out.println("the standard deviation of given results = " + standarddeviation);
	}
	public static int mean(int a[]) {
	
		int sum = 0;
		for (int n : a) {
			sum += n;
		}
		int mean = (sum / a.length);
	return mean;
	}
	public static int minimum(int a[]) {
	
		int minimum = a[0];
		return minimum;	
	}
	public static int maximum(int a[]) {
		
		int maximum = a[a.length-1];
		return maximum;
	}
	public static int range(int minimum, int maximum) {
		
		int range = maximum - minimum;
		
		return range;
	}
	
	public static double sdarray(int minimum, int maximum, int range, int mean) {
	int[] sdarray = {minimum, maximum, range, mean};
	int sdmean = 0;
	for (int i = 0; i < sdarray.length; i++) {
	        sdmean += sdarray[i];
	}
	sdmean /= sdarray.length;

	int variance = 0;
	for (int i = 0; i < sdarray.length; i++) {
	    variance += (sdarray[i] - sdmean) * (sdarray[i] - sdmean);
	}
	variance /= sdarray.length;

	// Standard Deviation
	double standarddeviation = Math.sqrt(variance);
	return standarddeviation;
	
	}
	}
	 
