import java.util.Scanner;
import java.text.DecimalFormat;

public class FPuserSum
{
		public static void main(String[]args)
				{
		double fp1, fp2, fpsum, fpdiff, fpprod, fpdiv;
		System.out.println("enter two decimal numbers:");
		Scanner	in = new Scanner(System.in);
		fp1 = in.nextDouble();
		fp2 = in.nextDouble();
		in.close();
		
		fpsum = fp1 + fp2;
		fpdiff = fp1 - fp2;
		fpprod = fp1 * fp2;
		fpdiv = fp1 / fp2;
		
		/** in printf
		 *System.out.printf("the sum is = " + "%.4f%n", fpsum);
		 *System.out.printf("the difference is =" + "%.4f%n", fpdiff);
		 *System.out.printf("the product is = " + "%.4f%n", fpprod);
		 *System.out.printf("the quotient is= " + "%.4f%n", fpdiv); 
		*/

		DecimalFormat dFormatter = new DecimalFormat("0.0000");
		
		String sum4dp = dFormatter.format(fpsum);
		String diff4dp = dFormatter.format(fpdiff);
		String prod4dp = dFormatter.format(fpprod);
		String div4dp = dFormatter.format(fpdiv);
		
		System.out.println("the sum is = " + sum4dp);
		System.out.println("the difference is =" + diff4dp);
		System.out.println("the product is = " + prod4dp);
		System.out.println("the quotient is= " + div4dp);	
 	
				}
}