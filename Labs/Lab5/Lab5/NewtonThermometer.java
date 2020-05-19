
/**
 * Write a description of class NewtonThermometer here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class NewtonThermometer extends Thermometer
{
    protected double getTemperature()
    {
        return (farenheitTemp - 32) * (11.0/60);
    }
    
    protected String printTemp()
    {
        System.out.println(getTemperature() + "\u00B0 N");
        return "";
    }
}
