import java.util.Scanner;

/**
 * Write a description of class FindMaxAndMin here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class FindMaxAndMin
{
    public static double findMax()
    {
        Scanner scan = new Scanner (System.in);
        System.out.println("Enter a series of numbers or any character to quit.");
        double largest = scan.nextDouble();
        while(scan.hasNextDouble())
        {
            double input = scan.nextDouble();
            if(input > largest)
            {
                largest = input;
            }
        }
        return largest;
     }
}

