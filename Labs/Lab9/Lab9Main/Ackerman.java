import java.util.Scanner;

/**
 * Models the Ackerman function
 * 
 * @author Julia Dunbar, Matt Pigliavento
 * @version Spring 2017
 */
public class Ackerman
{
    /**
     * Helper method for recursive method Ack
     */
    public static void AckHelper()
    {
        // create Scanner object
        Scanner prompt = new Scanner(System.in);
        
        // prompts user for two int values
        System.out.print("Enter a value for m: ");
        int m = prompt.nextInt();
        
        System.out.print("Enter a value for n: ");
        int n = prompt.nextInt();
        
        // prints the returned int value from the Ackerman function
        System.out.println(Ack(m, n));
    }
    
    /**
     * Models the Ackerman funciton recursively
     * 
     * @param m an int value
     * @param n an int value
     *
     * @return int result of the Ackerman function
     */
    public static int Ack(int m, int n)
    {
        // base case
        if (m == 0)
        {
            return n + 1;
        }
        
        // inductive step
        if (m > 0 && n == 0)
        {
            return Ack(m - 1, 1);
        }

        return Ack(m - 1, Ack(m, n - 1));
    }
}