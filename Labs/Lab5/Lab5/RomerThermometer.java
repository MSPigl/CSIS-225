
/**
 * Write a description of class RomerThermometer here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class RomerThermometer extends Thermometer
{
    protected double getTemperature()
    {
        return (farenheitTemp - 32)*0.29167 + 7.5;
    }
    
    protected String printTemp()
    {
        System.out.println(getTemperature() + "\u00B0 R\u00F8");
        return "";
    }
}
