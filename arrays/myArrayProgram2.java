import java.util.Arrays;

public class myArrayProgram2 
{
    public static void main(String[] args)
    {
        int[] grades = {9, 9, 7, 4, 3, 1, 4, 2, 5, 3};
        System.out.println(Arrays.toString(grades));    //to print the arrays

        int[][] grades2 = {{9, 9, 7}, {4, 3, 1, 4, 2, 5, 3}};
        System.out.println(Arrays.deepToString(grades2));    //to print the arrays
    }
}
