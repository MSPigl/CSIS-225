/**
 * @author Matt Pigliavento, Ronald Matos
 * @version Spring 2017
 */
public class Power
{
    /**
     * This method raises a base to an exponent iteratively
     * 
     * @param base a base value
     * @param exponent the exponent to raise the base to
     */
    public static double integerExp(double base, int exponent)
    {
        double value = base;
        for (int i = 1; i < exponent; i++)
        {
            value *= base;
        }
        return value;
    }
}