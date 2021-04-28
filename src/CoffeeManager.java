import java.util.ArrayList;
import java.util.Scanner;
import Coffee.AdeCoffee;
import Coffee.Coffee;
import Coffee.CoffeeCoffee;
import Coffee.JuiceCoffee;
import Coffee.TeaCoffee;

public class CoffeeManager {
	ArrayList<Coffee> coffees = new ArrayList<Coffee>();
	Coffee coffee;
	Scanner input;
	
	CoffeeManager(Scanner input) {
		this.input = input; 
	}
	
	public void addProduct() {
		int kind = 0;
		
		while (kind !=1 && kind !=2 && kind !=3 && kind !=4) {
			System.out.println("Select Coffee Kind :");
			System.out.println("1 for Coffee");
			System.out.println("2 for Juice");
			System.out.println("3 for Ade");
			System.out.println("4 for Tea");
			System.out.println("Select num for Coffee Kind 1 ~ 4 :");
			kind = input.nextInt();
			if (kind == 1) {
				coffee = new CoffeeCoffee();
				coffee.getCoffeeInput(input);
				coffees.add(coffee);
				break;
			}
			else if (kind == 2) {
				coffee = new JuiceCoffee();
				coffee.getCoffeeInput(input);
				coffees.add(coffee);
				break;
			}
			else if (kind == 3) {
				coffee = new AdeCoffee();
				coffee.getCoffeeInput(input);
				coffees.add(coffee);
				break;
			}
			else if (kind == 4) {
				coffee = new TeaCoffee();
				coffee.getCoffeeInput(input);
				coffees.add(coffee);
				break;
			}
			else {
				System.out.println("Select num for Coffee Kind between 1 ~ 4 :");
			}
		}
		
	}
		
	public void deleteProduct() {
		System.out.println("Write the Product Number you want to delete.");
		System.out.println("Product Number: ");
		int Pnum = input.nextInt();
		int index = -1;
		
		for (int i=0; i<coffees.size(); i++) {
			if (coffees.get(i).getPnum() == Pnum) {
				index = i;
				break;
			}
		}
		
		if(index >= 0) {
			coffees.remove(index);
			System.out.println("The Product Number (" + Pnum + ") is deleted");
		}
		else {
			System.out.println("The Product Number is empty");
			return;
		}
	}
		
	public void editProduct() {
		System.out.println("Write the Product Number you want to edit.");
		System.out.println("Product Number: ");
		int Pnum = input.nextInt();
		
		for (int i=0; i<coffees.size(); i++) {
			if (coffees.get(i).getPnum() == Pnum) {
				System.out.println("Choose the option you want to change.(1:Product Name, 2:Product Price)");
				int choose= input.nextInt();
				
				if (choose == 1) {
					System.out.println("Write the Product Name you want to change.");
					String edit = input.next();
					coffees.get(i).setPname(edit);
				}
				else {
					System.out.println("Write the Product Price you want to change.");
					int edit = input.nextInt();
					coffees.get(i).setPrice(edit);
				}
			}
		}
	}

	public void viewProducts() {
//		System.out.println("Write the product number you want to view.");
//		System.out.println("Product Number: ");
//		int Pnum = input.nextInt();
		for (int i=0; i<coffees.size(); i++) {
			coffees.get(i).printInfo();
		}
	}
}
