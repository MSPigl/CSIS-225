/**
 * Tests both iterative and recursive exponentiation methods
 * 
 * @author Matt Pigliavento, Ronald Matos
 * @version Spring 2017
 */
public class PowerDriver
{
    /**
     * Raises a base to a power recursively
     * 
     * @param base the base to be raised to an exponent
     * @param exponent the exponent
     */
    public static double recursiveIntegerExp(double base, int exponent)
    {
        if (exponent == 0)
        {
            return 1;
        }
        
        double half = recursiveIntegerExp(base, exponent / 2);
        
        if (exponent % 2 == 0)
        {
            return base * base;
        }
        return base * half * half;
    }
    
    /**
     * Main method for class PowerDriver
     * 
     * @param args an array of command line arguments
     */
    public static void main(String[] args)
    {
        System.out.println("Two raised to the seventh power is: " + Power.integerExp(2.0, 7) + " (iterative)");
        System.out.println("Two raised to the seventh power is: " + recursiveIntegerExp(2.0, 7) + " (recursive)");
    }
}
