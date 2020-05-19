
/**
 * Write a description of class Blastoff here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Blastoff
{
    public static void main(String[] args) throws InterruptedException
    {
        for (int i = 10; i > 0; i--)
        {
            System.out.println(i);
            Thread.sleep(1000);
        }
        Thread.sleep(1000);
        System.out.println("Blastoff!");
    }
}
