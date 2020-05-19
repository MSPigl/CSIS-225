import java.util.Scanner;

/**
 * Write a description of class PatternMatching here.
 * 
 * @author Matt, Jose 
 * @version Spring 2017
 */
public class PatternMatching
{
    public static void main(String[] args)
    {
        Scanner prompt = new Scanner(System.in);
        System.out.println("Enter a search string: ");
        String searchVal = prompt.next();
        
        String target = "Returns the index within this string of the first occurrence of the specified substring.";
        target = target.toLowerCase();
        
        System.out.println(target.indexOf(searchVal));
    }
}
