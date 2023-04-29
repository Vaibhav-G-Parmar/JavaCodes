import java.util.Arrays;

public class arraySearch 
{
    public static void main(String[] args)
    {
        int[] grades = {100,23,35,4,15};
        for(int i = 0; i < grades.length ; i++)
        {
            if(grades[i] == 2)
            {
                System.out.println("Found at index " + i);
            }
        }
        System.out.println(Arrays.toString(grades));
        Arrays.sort(grades);    //sorting the array
        System.out.println(Arrays.toString(grades));
        Arrays.parallelSort(grades);    //sorting the array - useful when working with large arrays
        System.out.println(Arrays.toString(grades));

        int[] grades2 = {100, 23, 35, 4, 15};
        if(Arrays.equals(grades, grades2))
        {
            System.out.println("Equals");
        }
        else
        {
            System.out.println("Not equals");
        }
        
        grades2 = grades;
        if(Arrays.equals(grades, grades2))
        {
            System.out.println("Equals");
        }
        Arrays.fill(grades2, 9);
        System.out.println(Arrays.toString(grades2));
    }
}
