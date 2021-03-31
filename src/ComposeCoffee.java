import java.util.Scanner;

public class ComposeCoffee {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		CoffeeManager coffeemanager = new CoffeeManager(input);
		int num=0;
		
		while (num != 6) {
			printmenu();			
			
		while ((num = input.nextInt()) !=6 ) {
			switch (num) {
				case (1) : coffeemanager.addProduct(); break; 
				case (2) : coffeemanager.deleteProduct(); break;
				case (3) : coffeemanager.editProduct(); break;
				case (4) : coffeemanager.viewProduct(); break;
				case (5) : break;
				default :
					System.out.println("메뉴를 잘못 선택하셨습니다." + "\n");
				}
			printmenu();
			}
				
		}
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
