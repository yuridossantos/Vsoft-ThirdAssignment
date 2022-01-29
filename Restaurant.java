import java.util.Scanner;

public class Restaurant {
	
	static Scanner sc = new Scanner(System.in);
	
	static void bill() {
		System.out.println("*****************************");
		System.out.println("Biryany bill:	"+(Biryani.biryani_total + Drinks.drinks_total + IceCream.iceCream_total));
		System.out.println("*****************************");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		while(true){
			System.out.println("*****************************");
			System.out.println("	1) Biryany			 ");
			System.out.println("	2) Drinks			 ");
			System.out.println("	3) IceCream			 ");
			System.out.println("	4) Bill				 ");
			System.out.println("	5) Exit				 ");
			System.out.println("*****************************");
			System.out.println("Enter the choice.");
			int choice = sc.nextInt();
			
			switch(choice) {
			case 1:
				Biryani bir = new Biryani();
				bir.biranyMenu();
				break;
			case 2:
				Drinks drink = new Drinks();
				drink.drinksMenu();
				break;
			case 3:
				IceCream iceCream = new IceCream();
				iceCream.iceCreamMenu();
				break;
			case 4:
				bill();
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


