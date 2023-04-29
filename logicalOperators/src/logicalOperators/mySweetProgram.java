package logicalOperators;
import java.util.Scanner;
public class mySweetProgram {
	
	public static void main(String[] args) {
		
		/*Comparison operators: 
		 * <
		 * >
		 * <=
		 * >=
		 * !=
		 * ==
		 */
		
		/* Logical Operators
		 * && - and
		 * || - or
		 * !  - not
		 */
		
		System.out.println("How old are you?");	
		
		Scanner scanner = new Scanner(System.in);
		int age = scanner.nextInt();
		//int age = Integer.parseInt(scanner.nextLine());
		
		System.out.println("Cats or Dogs?");	
		
		Scanner scanner2 = new Scanner(System.in);
		String animal = scanner2.nextLine();


		if(age > 12 && animal.equals("Dogs")) {
			System.out.println("Welcome!");
			
			System.out.println(animal);
		}
		System.out.println("Thank you!");
	}
	
}
