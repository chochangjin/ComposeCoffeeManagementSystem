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
			
			
		while ((num = input.nextInt()) !=6 ) {
			switch (num) {
				case (1) : addProduct(); break;
				case (2) : deleteProduct(); break;
				case (3) : editProduct(); break;
				case (4) : viewProduct(); break;
				case (5) : printmenu(); break;
				default :
					System.out.println("메뉴를 잘못 선택하셨습니다." + "\n");
				}
			}
				
		}
	}
	
	
	
	static public void addProduct() {
		Scanner input = new Scanner(System.in);
		System.out.println("Product Number: ");
		int productnum1 = input.nextInt();
		System.out.println("Product Name: ");
		String productname = input.next();
		
		printmenu();
	}
		
	static public void deleteProduct() {
		Scanner input = new Scanner(System.in);
		System.out.println("Write the product number you want to delete.");
		System.out.println("Product Number: ");
		int productnum2 = input.nextInt();
		
		printmenu();
	}
		
	static public void editProduct() {
		Scanner input = new Scanner(System.in);
		System.out.println("Write the product number you want to edit.");
		System.out.println("Product Number: ");
		int productnum3 = input.nextInt();
		System.out.println("Write the product name you want to change value.");
		String productnum4 = input.next();
		
		printmenu();
	}
		
	static public void viewProduct() {
		Scanner input = new Scanner(System.in);
		System.out.println("Write the product number you want to view.");
		System.out.println("Product Number: ");
		int productnum5 = input.nextInt();
		
		printmenu();
	}
	
	static public void printmenu() {
		System.out.println("1. Add Products");
		System.out.println("2. Delete Products");
		System.out.println("3. Edit Products");
		System.out.println("4. View Products");
		System.out.println("5. Show a menu");
		System.out.println("6. Exit");
		System.out.println("Select one number between 1-6: ");
	}

}
