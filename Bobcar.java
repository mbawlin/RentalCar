import java.util.Scanner;

public class Bobcar {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int cartype, member, exchange = 0; //exchange initialized for code to work
		int rentalDays;
		System.out.println("Available cars: 1 for Economy, 2 for Compact, 3 for Standard");
		System.out.print("Please choose the rental car: ");
		cartype = input.nextInt();
		int carcost = 0;
		String carlabel = "this is filler"; //initialization for code to work

		if (cartype == 1) {
			carcost = 25;
			carlabel = "Economy";
		} else if (cartype == 2) {
			carcost = 55;
			carlabel = "Compact";
		} else if (cartype == 3) {
			carcost= 100;
			carlabel = "Standard";
		} else {
			System.out.print("Invalid entry, please choose again:");	
			cartype = input.nextInt();
			if (cartype == 1) {
				carcost = 25;
				carlabel = "Economy";
			} else if (cartype == 2) {
				carcost = 55;
				carlabel = "Compact";
			} else if (cartype == 3) {
				carcost= 100;
				carlabel = "Standard";
			} else {
				System.out.print("\nHey idiot. Try entering the correct number.");
			}	
				cartype = input.nextInt();
				if (cartype == 1) {
					carcost = 25;
					carlabel = "Economy";
				} else if (cartype == 2) {
					carcost = 55;
					carlabel = "Compact";
				} else if (cartype == 3) {
					carcost= 100;
					carlabel = "Standard";
				} else {
					System.out.print("\nAlright guy. Try running the code again.");
					System.exit(1);
				}
		}
		System.out.print("Please enter the number of rental days: ");
		rentalDays = input.nextInt();
		System.out.print("Club member? 1 for yes, 0 for no: ");
		member = input.nextInt();
		if (member == 1) {
			System.out.print("Platinum Exchange package? 1 for yes, 0 for no: ");
			exchange = input.nextInt();
		}
		int basecost;
		basecost = carcost * rentalDays;
		if (cartype == 3) {
			System.out.print("\nBase: " + (int)(rentalDays) + " days for a(n) " + carlabel + " @ $" + (int)(carcost) + " per day: ");
			System.out.println("  $" + basecost);
		}
		else {
			System.out.print("\nBase: " + (int)(rentalDays) + " days for a(n) " + carlabel + " @ $" + (int)(carcost) + " per day: ");
			System.out.println("\t  $" + basecost);
		}

		int memberdiscount = 0;
		if (member == 1) {
			memberdiscount = (int) ((rentalDays / 5) * carcost);
			System.out.print("Club Member Discount: ");	
			System.out.println("\t\t\t\t- $" + memberdiscount);

		}
		int platpak = (int) (basecost * .2);
		if (exchange == 1) {

			System.out.print("Platinum Executive Package:");
			System.out.println("\t\t\t+ $" + platpak);
		}
		int total;
		if (member == 0) {
			total = basecost;
			System.out.print("\nTotal Estimate for Rental:");
			System.out.println("\t\t\t  $" + total);
		}
		else if (member == 1) {
			if (exchange == 1){
				total = basecost - memberdiscount + platpak;
				System.out.print("\nTotal Estimate for Rental:");
				System.out.println("\t\t\t  $" + total);
			}
			else if (exchange == 0) {	
				total = basecost - memberdiscount;
				System.out.print("\nTotal Estimate for Rental:");
				System.out.println("\t\t\t  $" + total);
			}
			input.close();
		}
	}

}