import java.util.Arrays;
import java.util.Scanner;

public class iterateMyArray 
{
    public static void main(String[] args)
    {
        // int[] grades = new int[10];
        // System.out.println(Arrays.toString(grades));

        // for(int i = 0; i < 10; i++)
        // {
        //     grades[i] = 5;
        // }
        // System.out.println(Arrays.toString(grades));

        /*int[] grades3 = new int[10];
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Please enter 10 inegers to store in the array : "   );
        for(int i = 0; i < 10; i++)
        {
            int input = scanner.nextInt();
            grades3[i] = input;
        }
        System.out.println(Arrays.toString(grades3));
        scanner.close();*/

        System.out.println("Please enter size for the array : ");
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();

        int[] grades4 = new int[size];
        System.out.println("Please enter " + size + " inegers to store in the array : ");
        for(int i = 0; i < size; i++)
        {
            System.out.print("Grades[" + i + "] = " );
            int input = scanner.nextInt();
            grades4[i] = input;  
        }
        System.out.println(Arrays.toString(grades4));
        scanner.close();
    }
}
