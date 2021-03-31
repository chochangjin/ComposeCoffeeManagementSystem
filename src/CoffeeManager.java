import java.util.Scanner;

public class CoffeeManager {
	Coffee coffee;
	Scanner input;
	CoffeeManager(Scanner input) {
		this.input = input;
	}
	
	
	public void addProduct() {
		coffee = new Coffee();
		System.out.println("Product Number: ");
		coffee.Pnum = input.nextInt();
		System.out.println("Product Name: ");
		coffee.Pname = input.next();
		System.out.println("Product Price: ");
		coffee.price = input.nextInt();
	}
		
	public void deleteProduct() {
		System.out.println("Write the Product Number you want to delete.");
		System.out.println("Product Number: ");
		int Pnum = input.nextInt();
		if (coffee == null) {
			System.out.println("The Product Number is empty");
			return;
		}
		if (coffee.Pnum == Pnum) {
			coffee = null;
			System.out.println("The Product is deleted");
			
		}
		
	}
		
	public void editProduct() {
		System.out.println("Write the Product Number you want to edit.");
		System.out.println("Product Number: ");
		int Pnum = input.nextInt();
		if (coffee == null) {
			System.out.println("The Product Number is empty");
			return;
		}
		if (coffee.Pnum == Pnum) {
			System.out.println("Choose the option you want to change.(1:Product Name, 2:Product Price");
			int choose= input.nextInt();
			
			if (choose == 1) {
				System.out.println("Write the Product Name you want to change.");
				String edit = input.next();
				coffee.Pname = edit;
			}
			else {
				System.out.println("Write the Product Price you want to change.");
				int edit = input.nextInt();
				coffee.price = edit;
			}
		}
	
	}

	public void viewProduct() {
		System.out.println("Write the product number you want to view.");
		System.out.println("Product Number: ");
		int Pnum = input.nextInt();
		
		if (coffee == null) {
			System.out.println("The Product Number is empty");
			return;
		}
		
		coffee.printInfo();
	}
}
