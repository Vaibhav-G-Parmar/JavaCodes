
public class mySweetProgram {

	public static void main(String[] args) {
		Student student = new Student();
		student.student_id = 144909;
		student.firstName = "Vaibhav";
		student.lastName = "Parmar";
		student.grades = 90.9;
		
		System.out.println("Student ID        : " + student.student_id);
		System.out.println("Student Full Name : " + student.getFullName());
		System.out.println("Student Grades    : " + student.grades);
	}
	
}
