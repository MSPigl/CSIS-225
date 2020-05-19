
/**
 * Write a description of class ReaumurThermometer here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ReaumurThermometer extends Thermometer
{
    protected double getTemperature()
    {
        return (farenheitTemp - 32)/2.25;
    }
    
    protected String printTemp()
    {
        System.out.println(getTemperature() + "\u00B0 R\u00E9");
        return "";
    }
}
