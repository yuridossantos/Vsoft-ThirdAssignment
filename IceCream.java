import java.util.Scanner;

public class IceCream {
	static Scanner sc = new Scanner(System.in);
	int iceCream_bill=0,butterScotch_price=5,chocolate_price=5;
	static int iceCream_total = 0;

	void butterScotch() {
		System.out.println("How many cones/cups would you like?");
		int cones_cups = sc.nextInt();
		iceCream_bill= cones_cups*butterScotch_price;
		iceCream_total += iceCream_bill;
		System.out.println(cones_cups+" cone(s)/cup(s): "+iceCream_bill);
	}
	
	void chocolate() {
		System.out.println("How many cones/cups would you like?");
		int cones_cups = sc.nextInt();
		iceCream_bill= cones_cups*chocolate_price;
		iceCream_total += iceCream_bill;
		System.out.println(cones_cups+" cone(s)/cup(s): "+iceCream_bill);
	}
	
	void iceCreamMenu() {
		while(true){
		System.out.println("*****************************");
		System.out.println("	1) Butter Scotch		 ");
		System.out.println("	2) Chocolate			 ");
		System.out.println("	3) Back 				 ");
		System.out.println("*****************************");
		System.out.println("Enter the choice.");
		int choice = sc.nextInt();
		
		switch(choice) {
		case 1:
			butterScotch();
			iceCreamMenu();
			break;
		case 2:
			chocolate();
			iceCreamMenu();
			break;
		case 3:
			Restaurant.main(null);
		default:
			System.out.println("Please choose between options 1 to 3.");
		
			}
		}	
	}















}
