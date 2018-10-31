package uk.ac.uos.i2p.practicaldice;

import java.util.*;

public class dice {

	public static void main(String[] args) {

		int[] dice1 = { 1, 2, 3, 4, 5, 6 };
		int[] dice2 = { 1, 2, 3, 4, 5, 6 };

		for (int n = 0; n < dice1.length; n++) {
			for (int x = 0; x < dice2.length; x++) {
				int[] outcome = { dice1[n] + dice2[x] };
				System.out.print(Arrays.toString(outcome));
			}
		}
	}
}



