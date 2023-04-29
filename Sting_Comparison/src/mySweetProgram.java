
public class mySweetProgram {

	public static void main(String[] args) {
		
		String name1 = "Vaibhav";
		String name2 = "Vaibhav";
		
		//do not use the below
		System.out.println(name1==name2);
		//name1 == name2 - not recommended with String 
		//string comparison like this only works with
		//the primitive types
		//and not the object types
		//values of objects is a reference to the object
		
		int x = 10;
		int y = 10;
		System.out.println(x == y);
	}

}
