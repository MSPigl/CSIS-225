/**
 * Performs various String operations recursively
 * 
 * @author Matt Pigliavento, Jose  
 * @version Spring 2017
 */
public class MyStringFunctions
{
    public static int strLength(String str)
    {
        if (str.equals(""))
        {
            return 0;
        }
        return 1 + strLength(str.substring(1));
    }
    
    public static String reverse(String str)
    {
        if (str.length() == 0)
        {
            return "";
        }
        return str.charAt(str.length() - 1) + reverse(str.substring(0, str.length() - 1));
    }
    
    public static String compact(String str)
    {
        if (str.length() == 0)
        {
            return "";
        }
        if (str.charAt(0) == '\n' || str.charAt(0) == '\t' || str.charAt(0) == ' ')
        {
            return "" + compact(str.substring(1));
        }
        return str.charAt(0) + compact(str.substring(1));
    }
}