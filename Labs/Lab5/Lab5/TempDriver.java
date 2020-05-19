/**
 * @author Matt Pigliavento, Ronald matos 
 * @version Spring 2017
 */
public class TempDriver
{
    public static void main(String[] args)
    {
        FahrenheitThermometer t1 = new FahrenheitThermometer();
        t1.setTemperature(32);
        
        CelsiusThermometer t2 = new CelsiusThermometer();
        t2.setTemperature(32);
        
        KelvinThermometer t3 = new KelvinThermometer();
        t3.setTemperature(32);
        
        RankineThermometer t4 = new RankineThermometer();
        t4.setTemperature(32);
        
        DelisleThermometer t5 = new DelisleThermometer();
        t5.setTemperature(32);
        
        NewtonThermometer t6 = new NewtonThermometer();
        t6.setTemperature(32);
        
        ReaumurThermometer t7 = new ReaumurThermometer();
        t7.setTemperature(32);
        
        RomerThermometer t8 = new RomerThermometer();
        t8.setTemperature(32);
        
        GasMarkThermometer t9 = new GasMarkThermometer();
        t9.setTemperature(32);
        
        Thermometer[] array = {t1, t2, t3, t4, t5, t6, t7, t8, t9};
        
        for (int i = 0; i < array.length; i++)
        {
            System.out.println(array[i].printTemp());
        }
    }
}
