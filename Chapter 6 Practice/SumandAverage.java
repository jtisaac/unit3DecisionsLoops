
import java.util.Scanner;
/**
 * Write a description of class SumandAverage here.
 * 
 * @author (JIsaac) 
 * @version (10/27/15)
 */
public class SumandAverage
{
    /** description of instance variable x (add comment for each instance variable) */
    public static double averageofvalues()
    {
        Scanner scan = new Scanner(System.in);
        double sum = 0;
        int count = 0;
        System.out.println("Enter a series of double or a character to quit");
        
        while(scan.hasNextDouble())
        {
            double input = scan.nextDouble();
            sum += input;
            count++;
        }
        
        double average = 0;
        if (count > 0)
        {
            average = sum/count;
        }
        return average;
        
   
    }

}
