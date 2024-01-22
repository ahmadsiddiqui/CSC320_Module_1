package module_one;

import java.util.Scanner;
import java.util.ArrayList;

public class WeeklyTemperature {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("Enter the day of the week or type 'week' for an average: ");
		String input = s.next();
		ArrayList<Integer> temps = new ArrayList<Integer>();
		temps.add(75);
		temps.add(78);
		temps.add(84);
		temps.add(83);
		temps.add(70);
		temps.add(69);
		temps.add(79);
		
		int avg = 0;
		for( Integer i: temps) {
			avg +=i;
		}
		avg /= 7;
		
		switch (input) {
        case "Monday":
            System.out.print("Monday's Temperature is: "+ temps.get(0));
            break;
        case "Tuesday":
            System.out.print("Tuesday's Temperature is: "+ temps.get(1));
            break;
        case "Wednesday":
            System.out.print("Wednesday's Temperature is: "+ temps.get(2));
            break;
        case "Thursday":
            System.out.println("Thursday's Temperature is: "+ temps.get(3));
            break;
        case "Friday":
            System.out.println("Friday's Temperature is: "+ temps.get(4));
            break;
        case "Saturday":
            System.out.println("Saturday's Temperature is: "+ temps.get(5));
            break;
        case "Sunday":
            System.out.println("Sunday's Temperature is: "+ temps.get(6));
            break;
        case "week":
        	System.out.println("The average temperature is: " + avg);
        	break;
        default:
            System.out.println("Invalid day");
            break;
    }
		
		s.close();
	}

}
