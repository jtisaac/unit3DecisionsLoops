import java.util.Scanner;
public class Substring
{

    public static void substring()
    {
        Scanner hengli = new Scanner(System.in);
        String word = hengli.next();
        int jimmylzhu = word.length();
        int currentletter = 0;
        int brinkmanship = 1;
        while (currentletter < jimmylzhu)
        {

            while (brinkmanship < jimmylzhu)
            {
                brinkmanship+=1;
            }
            currentletter+=1;
            brinkmanship = 1;
        }
    }

}
