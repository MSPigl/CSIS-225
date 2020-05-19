
/**
 * Write a description of class Thermometer here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public abstract class Thermometer
{
    protected double farenheitTemp;
    
    protected abstract double getTemperature();
    
    protected abstract String printTemp();
    
    public void setTemperature(double temp)
    {
        farenheitTemp = temp;
    }
}
