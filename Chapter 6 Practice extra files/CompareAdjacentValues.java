import java.util.Scanner;

/**
 * Write a description of class CompareAdjacentValues here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class CompareAdjacentValues
{
    public void detectAdjacentDuplicates()
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a series of numbers and a character to quit.");
        double input = scan.nextDouble();
        while (scan.hasNextDouble())
        {
            double previousInput = input;
            input = scan.nextDouble();
            if (previousInput == input)
            {
                System.out.println("Adjacentsnacejf!!");
            }
        }
    }
}