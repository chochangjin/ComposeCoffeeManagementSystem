
public class Coffee {
	int Pnum;
	String Pname;
	int price;
	
	public Coffee() {
	}
	
	public Coffee(int Pnum,  String Pname, int price) {
		this.Pnum = Pnum;
		this.Pname = Pname;
		this.price = price;
	}
	
	public void printInfo() {
		System.out.println("Product Number : " + Pnum);
		System.out.println("Product Name : " + Pname);
		System.out.println("Product Price : " + price);
	}
	
	
	
}
