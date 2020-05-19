
/**
 * Write a description of class CelsiusThermometer here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class CelsiusThermometer extends Thermometer
{
    protected double getTemperature()
    {
        return (farenheitTemp - 32)/1.8;
    }
    
    protected String printTemp()
    {
        System.out.println(getTemperature() + "\u00B0 C");
        return "";
    }
}
