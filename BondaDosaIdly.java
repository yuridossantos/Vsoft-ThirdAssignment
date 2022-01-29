import java.util.Scanner;

public class BondaDosaIdly {
	
	static Scanner sc = new Scanner(System.in);
	int total_bill=0,bonda_bill=0,bonda_price=50;
	int dosa_bill=0,dosa_price=40;
	int idly_bill=0,idly_price=30;
	
	
	void bonda() {
		System.out.println("How many bonda plates would you like?");
		int plates = sc.nextInt();
		bonda_bill = plates*bonda_price;
		System.out.println(plates+" bonda plates : "+bonda_bill);
	}
	
	void dosa() {
		System.out.println("How many dosa plates would you like?");
		int plates = sc.nextInt();
		dosa_bill = plates*dosa_price;
		System.out.println(plates+" dosa plates : "+dosa_bill);
	}
	
	void idly() {
		System.out.println("How many idly plates would you like?");
		int plates = sc.nextInt();
		idly_bill = plates*idly_price;
		System.out.println(plates+" idly plates : "+idly_bill);
	}
	
	void bill() {
		total_bill = bonda_bill+dosa_bill+idly_bill;
		System.out.println("Your total i: "+total_bill);
	}

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BondaDosaIdly obj = new BondaDosaIdly();
		while(true){
			System.out.println("*****************************");
			System.out.println("	1) Bonda			 ");
			System.out.println("	2) Dosa				 ");
			System.out.println("	3) Idly				 ");
			System.out.println("	4) Bill				 ");
			System.out.println("	5) Exit				 ");
			System.out.println("*****************************");
			System.out.println("Enter the choice.");
			int choice = sc.nextInt();
			
			switch(choice) {
			case 1:
				obj.bonda();
				break;
			case 2:
				obj.dosa();
				break;
			case 3:
				obj.idly();
				break;
			case 4:
				obj.bill();
				break;
			case 5:
				System.out.println("Thanks for using the app!");
				System.exit(0);
			default:
				System.out.println("Please choose between options 1 to 5.");
			}			
		}
	}
}
