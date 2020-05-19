import java.util.Scanner;
/**
 * Write a description of class Equality here.
 * 
 * @author Matt, Jose 
 * @version Spring 2017
 */
public class Equality
{
    public static void main(String[] args)
    {
        Scanner prompt = new Scanner(System.in);
        
        System.out.println("Enter two words (separated by whitespace): ");
        
        String word1 = prompt.next();
        String word2 = prompt.next();
        
        System.out.println(word1.equalsIgnoreCase(word2));
    }
}
