
/**
 * Write a description of class RankineThermometer here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class RankineThermometer extends Thermometer
{
    protected double getTemperature()
    {
        return farenheitTemp + 459.67;
    }
    
    protected String printTemp()
    {
        System.out.println(getTemperature() + "\u00B0 Ra");
        return "";
    }
}
