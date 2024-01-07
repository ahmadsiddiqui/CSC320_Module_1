
package module_one;
import java.util.Scanner;
public class WithholdingCalculator {
	public static void main(String args[]) {
		System.out.print("Enter the income value:");
		Scanner s = new Scanner(System.in);
		double tax_rate = 0;
		double income = s.nextDouble();
		if(income<500) {
			tax_rate = 0.10;
		}
		if (income >= 500 && income < 1500) {
			tax_rate = 0.15;
		}
		if (income >=1500 && income <2500) {
			tax_rate = 0.20;
		}
		if (income >= 2500) {
			tax_rate = 0.30;
		}
		double withholding_amount = income*tax_rate;
		System.out.print("The withholding amount is: " + withholding_amount);
		
		s.close();
		
		
	}
}
