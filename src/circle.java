import java.util.Scanner;

public class circle
{
		public static void main(String[]args)
				{
		double radius, perim, area, spvol;
			
		System.out.println("enter the radius:");
		Scanner	in = new Scanner(System.in);
		radius = in.nextDouble();
		in.close();
		
		perim = Math.PI*2*radius;
		area = Math.PI*radius*radius;
		spvol = 4/3*Math.PI*radius*radius*radius;
				
		
		System.out.println("perimeter = " + perim);
		System.out.println("area = " + area);
		System.out.println("Spherevol= " + + spvol);
		
		
				}
}