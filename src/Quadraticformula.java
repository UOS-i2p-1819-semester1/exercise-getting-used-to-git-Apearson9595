import java.util.Scanner;

public class Quadraticformula {
	
	/** calculate the roots of a quadratic equation:
	 * x = ax^2 + bx + c
	 */

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		double a; 
		double b;
		double c;
		double discrim;
		double x1, x2;
		
		// Ask user for numerical values of a, b & c
		System.out.println("enter numerical values of a,b,c");
		System.out.print("a: ");
		a = sc.nextDouble();
		System.out.print("b: ");
		b = sc.nextDouble();
		System.out.print("c: ");
		c = sc.nextDouble();
		
		// calculate the discriminant to help determine the number of roots
		discrim = Math.pow(b, 2)-4*a*c;
		
		
		// calculate the number of roots
		if (discrim > 0){
			x1 = (-b + Math.sqrt(discrim))/(2*a);
			x2 = (-b - Math.sqrt(discrim))/(2*a);
			System.out.println("Two real roots:\nx1 = " + x1 + "\nx2 = " + x2);
		}
		else if (discrim == 0) {
			x1 = (-b + Math.sqrt(discrim))/(2*a);
			System.out.println("One real root:\nx1 = " + x1);
		}
		else {
			System.out.println("There are no real roots");		
		}		
	}
}

