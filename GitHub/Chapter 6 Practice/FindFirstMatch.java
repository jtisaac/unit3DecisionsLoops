

/**
 * Write a description of class FindFirstMatch here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class FindFirstMatch
{
    //returns thje index of tyje fost space in the specifierd string or -1 if the stiring comtaoms mo spaces
    public static int findFirstSpace(String str)
    {
     boolean found = false;
     int position = 0;
     
     while (!found && position < str.length())
     {
         char ch = str.charAt(position);
         if (ch == ' ')
         {
             found = true;
            }
         else
         {
             position++;
            }
         
         
     }
     if (!found)
         {
             position = -1;
            }
     return position;
   }
}
