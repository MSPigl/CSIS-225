
/**
 * Write a description of class GasMarkThermometer here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class GasMarkThermometer extends Thermometer
{
    protected double getTemperature()
    {
        double temp = 0.0;
        
        if (farenheitTemp >= 275)
        {
            double exponent = (farenheitTemp - 275)/25;
            temp = Math.pow(2, exponent);
        }
        else
        {
            temp = (farenheitTemp - 275)/25 + 1;
        }
        return temp;
    }
    
    protected String printTemp()
    {
        System.out.println(getTemperature() + "\u00B0");
        return "";
    }
}
