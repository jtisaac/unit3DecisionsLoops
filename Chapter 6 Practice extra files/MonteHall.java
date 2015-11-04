import java.util.Scanner;
import java.util.Random;
public class MonteHall
{
    public static void main(String[] args)
    {
        System.out.println("Choose a door 1, 2, or 3. How to win? You pick the car.");
        Random hengli = new Random();
        int door1num = hengli.nextInt(1);
        String door1;
        String door2;
        String door3;
        
        if (door1num == 1)
        {
            int door2num = 0;
            int door3num = 0;
        }
        else
        {
            int door2num = hengli.nextInt(1);
            if (door2num ==1)
            {
                int door3num = 0;
            }
        }
        if (door1num == 1)
        {
            String door1 = "car";
        }
        else
        {
            door1 = "goat";
        }
        if (door2num == 1)
        {
            String door2 = "car";
        }
        else
        {
            door2 = "goat";
        }
        if (door3num == 1)
        {
            String door3 = "car";
        }
        else
        {
            door3 = "goat";
        }
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter a number.");
        int userinput1 = in.nextInt();
        
        
    }
} 
