import java.util.Scanner;


public class test{

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String sport, dorm, name, health; 
		int age, years, weight;
		
		
		System.out.print("Hello! What is your name? ");
		name = input.next();
		System.out.print("How old are you? ");
		age = input.nextInt();
		System.out.print("Where on campus do you live? ");
		dorm = input.next();
		System.out.print("What is your favorite sport? ");
		sport = input.next();
		System.out.print("In how many years will you graduate? (as a number) ");
		years = input.nextInt();
		System.out.print("In pounds, how much do you weigh? ");
		int n1 = input.nextInt();
		System.out.print("Describe a goal for your body in one word. ");
		health = input.next();
		
		System.out.print("\nThis is " + name +"! ");
		System.out.println("He is " + age +" and lives in " + dorm+". ");
		System.out.println(name +" plays " + sport +" and wants to graduate in " +years+ " years.");
		System.out.print("He weighs " + (int) (n1/2.2) + "kilograms  and wants to become " +health+ ".");
		
	}

}