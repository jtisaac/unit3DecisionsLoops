import java.util.Scanner;
public class Diamond
{

    public static void main(String []arg)
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("input an integer:");
        int num = scan.nextInt();
        int startingSpace = num - 1;
        int first = 0;
        
        String spaces = " ";
        String ask = "*";
        
        int times = num + num -1;
        int x = 0;
        int charlen = num;
        while (x<times)
        {
            String str = "";
            int space = num -1;
            while(space > 0)
            {
                
                str += spaces;
                
                
                
                space--;
                charlen += 1;
            }
            int asks = num;
            
            while(asks < charlen)
            {
                
                
            }
            num += 1;
            charlen += 0;
        }
        /*
         * side length = 4
         * row spaces stars
         * 0 3 1
         * 1 2 3
         * for (int row = 0;
         * row<sidelength;
         * row ++)
         * {
         *     for (int spaces< sidelength-row-1;
         *     spaces++)
         *     [
         *     system.out.print" ");
         *     }
         *     for (int stars = 0;
         *     did it as a function of the row
         *     stars<row*2+1; stars ++)
         *     
         *         system.print the star
         *     }
         *     
         *     
         *     now for the botttom half
         *     
         *     row variable repeats then for the botttom of the diamond
         *     
         *     use the opposite strategy for the bottom of the diamond
         *     spaces<sidelength-row-1
         *     stars<row*2+1
         *     0
         *     1
         *     2
         *     3
         *     2
         *     1
         *     0
         *     
         */
       
        
    }

}
