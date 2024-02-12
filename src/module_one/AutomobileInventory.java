package module_one;

import java.util.ArrayList;
import java.util.Scanner;

public class AutomobileInventory {
	static private ArrayList<Automobile> inventory = new ArrayList<Automobile>();
	public static void main (String args[]) {
		
		Scanner s = new Scanner(System.in);
		while (true) {
			System.out.println("Enter C to create a vehicle, D to delete a vehicle or L to List a vehicle.");
			String option = s.next();
			switch (option) {
			case ("C"):

				Automobile a = new Automobile();

				System.out.print("Enter the vin: ");
				a.setVin(s.next());

				System.out.print("Enter the year: ");
				a.setYear(s.nextInt());

				System.out.print("Enter the make: ");
				a.setMake(s.next());

				System.out.print("Enter the model: ");
				a.setModel(s.next());

				System.out.print("Enter the trim: ");
				a.setTrim(s.next());

				System.out.print("Enter the color: ");
				a.setColor(s.next());

				System.out.print("Enter the price: ");
				a.setPrice(s.nextInt());

				System.out.print("Enter the mileage: ");
				a.setMileage(s.nextInt());

				System.out.print("Enter the extra info: ");
				a.setExtraInfo(s.next());

				addToInventory(a);
				
				break;
			case ("D"):
				System.out.println("Enter the VIN of the vehicle to delete: ");
				String input = s.next();
			for (Automobile i : inventory) {
				if (i.getVin().equals(input)) {
					removeAutomobile(inventory.indexOf(i));
					break;
				}
				else {
					System.out.println("The vehicle could not be found");
					break;				
				}
			}
			case ("L"):
				System.out.println("Enter the VIN of the vehicle to list: ");

				input = s.next();
				for (Automobile i : inventory) {
					if (i.getVin().equals(input)) {
						printAutomobile(i);
						break;
					}
					else {
						System.out.println("The vehicle could not be found");
						break;
					}
				}
				
			}
		}
		
		
	}
	private static void removeAutomobile(int i) {
		try {
			inventory.remove(i);
			System.out.println("The vehicle was removed.");
		}
		catch(Exception e){
			System.out.println("The vehicle could not be removed.");
		}
		
	}
	private static void printAutomobile(Automobile a) {
		System.out.println("VIN: " + a.getVin());
        System.out.println("Year: " + a.getYear());
        System.out.println("Make: " + a.getMake());
        System.out.println("Model: " + a.getModel());
        System.out.println("Trim: " + a.getTrim());
        System.out.println("Color: " + a.getColor());
        System.out.println("Price: " + a.getPrice());
        System.out.println("Mileage: " + a.getMileage());
        System.out.println("Extra Info: " + a.getExtraInfo());
    }
	static public void addToInventory(Automobile a) {
		try {
			inventory.add(a);
			System.out.println("The vehicle was added to the inventory.");
		}
		catch(Exception e) {
			System.out.println("The vehicle was NOT added to the inventory");
		}
	}
}
