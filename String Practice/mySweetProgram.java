import java.util.Scanner;

public class mySweetProgram {

	public static void main(String[] args) {

		String name = "Vaibhav"; 
		
		System.out.println(String.format("Hello, %s", name));
		
		System.out.println(name.length());
		System.out.println(name.charAt(name.length()-1));
		System.out.println(name.concat(" is my name!"));
		
		System.out.println(name.contains("x"));
		System.out.println(name.indexOf("V",2));
		
		System.out.println(name.toUpperCase());
		System.out.println(name.toLowerCase());

		String fullAd = " whatever happens, happens for the good   ";
		System.out.println(fullAd);
		
		fullAd = " \t\nwhatever happens, happens for the good   ";
		System.out.println(fullAd.strip());
		//space as well as \t or \n also get removed in the strip command
		
		fullAd = "whatever happens, happens for the good";
		System.out.println(fullAd.substring(9));
		System.out.println(fullAd.substring(4, 16));
		//in substring function the first index is inclusive and the second index is exclusive
		
		String das = "Das na Das!\n";
		System.out.println(das.repeat(3));
		System.out.println(das.equals("Das na Das"));
		
				
	}

}
