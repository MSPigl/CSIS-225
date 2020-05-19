
/**
 * Write a description of class DelisleThermometer here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class DelisleThermometer extends Thermometer
{
    protected double getTemperature()
    {
        return (212 - farenheitTemp)*(5.0/6);
    }
    
    protected String printTemp()
    {
        System.out.println(getTemperature() + "\u00B0 De");
        return "";
    }
}
