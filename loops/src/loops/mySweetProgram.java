package loops;

import java.util.Scanner;

public class mySweetProgram {
	
	public static void main(String[] args) {

		/*ICU
		 * I - Initialization
		 * C - Comparison
		 * U - Update
		 * */
		int i = 1;
		while(i < 11) {
			System.out.println("Hello " + i);
			i++;
		}
		System.out.println("Please enter the password");
		String password = "dasnadas";
		Scanner scanner = new Scanner(System.in);
		String guess = scanner.nextLine();
		
		if(guess.equals(password)) {
			System.out.println("Welcome!");
		}else {
			System.out.println("Go away");
		}
		
		scanner.close();
	}
}
