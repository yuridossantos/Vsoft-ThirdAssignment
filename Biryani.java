import java.util.Scanner;
public class Biryani {

	static Scanner sc = new Scanner(System.in);
	int chickenBn_bill=0,chickenBn_price=50;
	int vegnBn_bill=0,vegnBn_price=60;
	int fishBn_bill=0,fishBn_price=70;
	static int biryani_total = 0;
	
	void chickenBn() {
		System.out.println("How many chickenBn plates would you like?");
		int plates = sc.nextInt();
		chickenBn_bill = plates*chickenBn_price;
		biryani_total += chickenBn_bill;
		System.out.println(plates+" chickenBn plates : "+chickenBn_bill);
	}
	
	void vegnBn() {
		System.out.println("How many vegnBn plates would you like?");
		int plates = sc.nextInt();
		vegnBn_bill = plates*vegnBn_price;
		biryani_total += vegnBn_bill;
		System.out.println(plates+" vegnBn plates : "+vegnBn_bill);
	}
	
	void fishBn() {
		System.out.println("How many vegnBn plates would you like?");
		int plates = sc.nextInt();
		fishBn_bill= plates*fishBn_price;
		biryani_total += fishBn_bill;
		System.out.println(plates+" vegnBn plates : "+fishBn_bill);
	}
	
	
	void biranyMenu() {
			while(true){
			System.out.println("*****************************");
			System.out.println("	1) ChickenBn			 ");
			System.out.println("	2) VegnBn				 ");
			System.out.println("	3) FishBn				 ");
			System.out.println("	4) Back 				 ");
			System.out.println("*****************************");
			System.out.println("Enter the choice.");
			int choice = sc.nextInt();
			
			switch(choice) {
			case 1:
				chickenBn();
				biranyMenu();
				break;
			case 2:
				vegnBn();
				biranyMenu();
				break;
			case 3:
				fishBn();
				biranyMenu();
				break;
			case 4:
				Restaurant.main(null);
			default:
				System.out.println("Please choose between options 1 to 4.");
			}			
		}
	}
		
}
