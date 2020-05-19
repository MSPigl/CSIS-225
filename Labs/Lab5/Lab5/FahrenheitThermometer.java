
/**
 * Write a description of class FahrenheitThermometer here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class FahrenheitThermometer extends Thermometer
{
    protected double getTemperature()
    {
        return farenheitTemp;
    }
    
    protected String printTemp()
    {
        System.out.println(getTemperature() + "\u00B0 F");
        return "";
    }
}
