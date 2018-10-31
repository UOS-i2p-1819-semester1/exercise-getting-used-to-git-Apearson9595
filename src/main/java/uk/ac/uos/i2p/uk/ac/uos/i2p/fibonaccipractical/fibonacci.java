package uk.ac.uos.i2p.uk.ac.uos.i2p.fibonaccipractical;

import java.util.*;

public class fibonacci {

	public static void main(String[] args) {

		int n = (20);
		int a, b, c;
		a = 0;
		b = 1;

		int flag = 1;
		while (flag <= n) {
			int[] fib = { a };
			System.out.print(Arrays.toString(fib));
			c = (a + b);
			a = b;
			b = c;
			flag++;
		}
	}
}




