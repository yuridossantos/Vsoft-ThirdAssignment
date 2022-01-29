import java.util.Scanner;

public class Drinks {
	static Scanner sc = new Scanner(System.in);
	int softDrinks_bill=0,sprite_price=5,thumsUp_price=5;
	int hotDrinks_bill=0,tea_price=5,coffee_price=5;
	static int drinks_total = 0;
		
	
	void softDrinks() {
		while(true){
		System.out.println("*****************************");
		System.out.println("	1) Sprite			 ");
		System.out.println("	2) ThumsUp			 ");
		System.out.println("	3) Back 			 ");
		System.out.println("*****************************");
		System.out.println("Enter the choice.");
		int choice = sc.nextInt();
		
		switch(choice) {
		case 1:
			System.out.println("How many cans of sprite would you like?");
			int cans = sc.nextInt();
			softDrinks_bill = cans*sprite_price;
			drinks_total += softDrinks_bill;
			System.out.println(cans+" can(s) of sprite: "+softDrinks_bill);
			softDrinks();
			break;
		case 2:
			System.out.println("How many cans of thumsup would you like?");
			int cans2 = sc.nextInt();
			softDrinks_bill = cans2*thumsUp_price;
			drinks_total += softDrinks_bill;
			System.out.println(cans2+" can(s) of thumsup: "+softDrinks_bill);
			softDrinks();
			break;
		case 3:
			drinksMenu();
		default:
			System.out.println("Please choose between options 1 to 3.");
		
			}
		}	
	}
	
	void hotDrinks() {
		while(true){
		System.out.println("*****************************");
		System.out.println("	1) Tea				 ");
		System.out.println("	2) Coffee			 ");
		System.out.println("	3) Back 			 ");
		System.out.println("*****************************");
		System.out.println("Enter the choice.");
		int choice = sc.nextInt();
		
		switch(choice) {
		case 1:
			System.out.println("How many cups of tea would you like?");
			int cups = sc.nextInt();
			hotDrinks_bill = cups*tea_price;
			drinks_total += hotDrinks_bill;
			System.out.println(cups+" cup(s) of Tea: "+hotDrinks_bill);
			hotDrinks();
			break;
		case 2:
			System.out.println("How many cups of coffee would you like?");
			int cups2 = sc.nextInt();
			hotDrinks_bill = cups2*coffee_price;
			drinks_total += hotDrinks_bill;
			System.out.println(cups2+" cup(s) of coffee: "+hotDrinks_bill);
			hotDrinks();
			break;
		case 3:
			drinksMenu();
		default:
			System.out.println("Please choose between options 1 to 3.");
		
			}
		}	
	}
	
	void drinksMenu() {
		while(true){
		System.out.println("*****************************");
		System.out.println("	1) Soft Drinks			 ");
		System.out.println("	2) Hot Drinks			 ");
		System.out.println("	3) Back 				 ");
		System.out.println("*****************************");
		System.out.println("Enter the choice.");
		int choice = sc.nextInt();
		
		switch(choice) {
		case 1:
			softDrinks();
			drinksMenu();
			break;
		case 2:
			hotDrinks();
			drinksMenu();
			break;
		case 3:
			Restaurant.main(null);
		default:
			System.out.println("Please choose between options 1 to 3.");
		
			}
		}	
	}
}
