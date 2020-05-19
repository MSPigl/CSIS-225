
/**
 * Write a description of class KelvinThermometer here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class KelvinThermometer extends Thermometer
{
    protected double getTemperature()
    {
        return (farenheitTemp + 459.67)*(5.0/9);
    }
    
    protected String printTemp()
    {
        System.out.println(getTemperature() + "\u00B0 K");
        return "";
    }
}
