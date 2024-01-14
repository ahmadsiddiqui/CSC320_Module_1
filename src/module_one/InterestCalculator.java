package module_one;
import java.util.Scanner;
public class InterestCalculator {
	public static void main(String args[]) {
		
		double[] numbers = new double[5];
		Scanner s = new Scanner(System.in);
		double total = 0;
		double max;
		double min;
		double input = 0;
		
		int i = 0;
		while(i<5) {
			System.out.println("Enter a value: ");
			input = s.nextDouble();			
			numbers[i] = input;	
			total += input;
			i++;
		}
		s.close();
		max = numbers[0];
		for (i = 0; i < 5; i++) {
			if(max < numbers[i]) {
				max = numbers[i];
			}
		}
		
		min = numbers[0];
		for(i = 0; i < 5; i++) {
			if(min>numbers[i]) {
				min = numbers[i];
			}
		}
		
		System.out.println("Total: "+ total);
		System.out.println("Average: "+ (total/5));
		System.out.println("Minimum: "+ min);
		System.out.println("Maximum: "+ max);
		System.out.println("Interest on total at 20%: "+ total *0.2);
		
		
		
	}

}
