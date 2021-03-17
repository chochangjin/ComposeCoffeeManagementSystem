import java.util.Scanner;

public class ComposeCoffee {

	public static void main(String[] args) {
		int num=0;
		Scanner input = new Scanner(System.in);
		
		while (num != 6) {
			System.out.println("1. Add Products");
			System.out.println("2. Delete Products");
			System.out.println("3. Edit Products");
			System.out.println("4. View Products");
			System.out.println("5. Show a menu");
			System.out.println("6. Exit");
			System.out.println("Select one number between 1-6: ");
			num=input.nextInt();
			switch(num) {
			case 1:
				System.out.println("Product Number: ");
				int productnum1 = input.nextInt();
				System.out.println("Product Name: ");
				String productname = input.next();
				break;
				
			case 2:
				System.out.println("Write the product number you want to delete.");
				System.out.println("Product Number: ");
				int productnum2 = input.nextInt();
				break;
				
			case 3:
				System.out.println("Write the product number you want to edit.");
				System.out.println("Product Number: ");
				int productnum3 = input.nextInt();
				System.out.println("Write the product name you want to change value.");
				String productnum4 = input.next();
				break;
			case 4:
				System.out.println("Write the product number you want to view.");
				System.out.println("Product Number: ");
				int productnum5 = input.nextInt();
				break;
							
				
			}
		
		}
	}

}
