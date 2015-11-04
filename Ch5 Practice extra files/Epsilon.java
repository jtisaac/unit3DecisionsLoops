

/**
 * Floating point analysis: Write a description of class Epsilon here.
 * 
 * @author (Joseph) 
 * @version (10/14/15)
 */
import java.util.Scanner;
public class Epsilon
{
    public static final double EPSILON = 1e-12;
    public static void main(String[] arg )
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a floating point number: ");
        /** description of instance variable x (add comment for each instance variable) */
        double i = in.nextDouble();

        String adj = " ";
    if (Math.abs(i)<1.0)
    {
        adj = "small";
        
    }
    else if (Math.abs(i-0) < EPSILON )
    {
        adj = "large";
    }
    if (Math.abs(i-0)< EPSILON)
    {
        System.out.println("It's a 0.");
    }
    else if (i>0)
    {
        System.out.println("Ti's a " + adj + "positive number.");
    }
    else
    {
        System.out.println("It's a " + adj + "negative number.");
    }
    

  }
  }


