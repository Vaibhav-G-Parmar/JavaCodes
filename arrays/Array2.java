import java.util.Arrays;

public class Array2 
{
    public static void main(String[] args) 
    {
        int[][] grades = {
                {1, 5, 3},
                {8, 4, 2, 6, 3, 1},
                {4, 6, 2}
        };    
        System.out.println(Arrays.deepToString(grades));;
        System.out.println(grades.length);
        System.out.println(grades[0].length);
        System.out.println(grades[1].length);

        for(int i = 0; i < grades.length; i++)
        {
            for(int k = 0; k < grades[i].length; k++)
            {
                System.out.print(grades[i][k] + " ");;
            }
            System.out.println();
        }
    }
}
