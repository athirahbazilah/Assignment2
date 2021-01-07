import java.util.*;
public class Assignment2 {

	public static void main(String[] args) {
		
		Scanner in = new Scanner (System.in);
		
		System.out.print("Enter Name: ");
		String name = in.nextLine();
		System.out.println("Name: " + name);
		System.out.println();
		System.out.print("Enter Work: ");
		String work = in.nextLine();
		System.out.println("Work: " + work);
		System.out.println();
		System.out.print("Enter Age: ");
		int age = in.nextInt();
		System.out.println("Age: " + age);
		System.out.println();
		
		 System.out.print("How many person with you?" );
	        int person = in.nextInt();
	        for (int i=0; i<=person; i++); {
	        	System.out.print("Enter Name: ");
	        	String name2 = in.next();
	        }
		
		System.out.print("Enter salary: ");
		int salary = in.nextInt();
		System.out.println("Salary: " + salary);
		System.out.println();
		
		String route1 = "Batu Cave to Pulau Sebang";
		String route2 = "Tanjung Malim to Pelabuhan Klang";
		String route3 = "Padang Rengas to Bukit Mertajam";
		String route4 = "Butterworth to Padang Besar";
		String route5 = "Pulau Sebang to Batu Cave";
		String route6 = "Pelabuhan Klang to Tanjung Malim";
		String route7 = "Bukit Mertajam to Padang Rengas";
		String route8 = "Padang Besar to Butterworth";
		
		String route = in.toString();
		route = route1 + route5;
		
		int fee1 = 35;
		int fee2 = 30;
		int fee3 = 32;
		int fee4 = 40;
		int fee5 = 33;
		int fee6 = 31;
		int fee7 = 34;
		int fee8 = 38;
		
		
		if (route1 == "Pulau Sebang to Batu Cave") {
			System.out.println("Right Station");
		}
		if (route2 != route3) {
			System.out.println("Different Distance");
		}
		if (route2 == route6) {
			System.out.println("Same Distance");
		}
		if (route3 != route7) {
			System.out.println("Different Distance");
		}
		if (route4 != "Butterworth to Padang Besar") {
			System.out.println("Wrong Station");
		}
		if (route8 == route4) {
			System.out.println("Same Distance");
		}
		
		int i1 = 35;
		int i2 = 30;
		int i3 = 32;
		int i4 = 40;
		int i5 = 33;
		int i6 = 31;
		int i7 = 34;
		int i8 = 38;
			
		if (i1 < i4) {
			System.out.println("Route4 cheaper");
		}
		if (i1 > i4) {
			System.out.println("Route1 more pricey");
		}
		if (i2 > i6) {
			System.out.println("Route2 more pricey");
		}
		if (i2 < i6) {
			System.out.println("Route2 cheaper");
		}
		if (i3 >= i7) {
			System.out.println("Route3 much pricey");
		}
		if (i3 <= i7) {
			System.out.println("Route3 much cheaper");
		}
		if (i4 <= i8) {
			System.out.println("Route4 much cheaper");
		}
		if (i4 >= i8) {
			System.out.println("Route4 much pricey");
		}
		
		System.out.println("Enter customer background: " + name + "\n\t\t " + age + "\n\t\t " + work + "\n\t\t " + salary);
		System.out.print("What route path that you want to go: " + route);
		System.out.println();
		System.out.print("Fee that customer need to pay: " + (fee1 + fee5));
		System.out.println();
		
		
		System.out.println("**********THANK YOU FOR YUOR PURCHASE**********");
		
	
		
			

	}

}
