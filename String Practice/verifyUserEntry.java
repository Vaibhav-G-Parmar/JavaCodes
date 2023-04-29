import java.util.Scanner;

public class mySweetProgram {

	public static void main(String[] args) {
		
		//verify the password user enters, correct password is "dasnadas"
		
		String password = "dasnadas";
		System.out.println("\nPlease enter the password: ");
		
		Scanner scanner = new Scanner(System.in);
		String userEntry = scanner.nextLine();
		
		if(userEntry.equals(password)) {
			System.out.println("\nLogged in successfully!\n");
		}
		else {
			System.out.println("\nError! Wrong Password!\n");
		}
		
	}

}
