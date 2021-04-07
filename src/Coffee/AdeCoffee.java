package Coffee;

import java.util.Scanner;

public class AdeCoffee extends Coffee {
	public void getCoffeeInput(Scanner input) {
		System.out.println("Product Number: ");
		int Pnum = input.nextInt();
		this.setPnum(Pnum);
	
		System.out.println("Product Name: ");
		String Pname = input.next();
		this.setPname(Pname);
		
		char answer = 'x';
		while (answer != 'y' || answer != 'Y' || answer != 'n' || answer != 'N') {
			System.out.println("Do you want to add fruite? (Y/N)");
			answer = input.next().charAt(0);
			if (answer == 'y' || answer == 'Y') {
				System.out.println("Product Price: ");
				int price = input.nextInt() + 1000;
				this.setPrice(price);
				break;
			}
			else if (answer == 'n' || answer == 'N') {
				System.out.println("Product Price: ");
				int price = input.nextInt();
				this.setPrice(price);
				break;
			}
			else {
			}
		}
	}
}
