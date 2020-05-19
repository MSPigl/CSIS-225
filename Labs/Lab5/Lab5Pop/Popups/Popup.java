import javax.swing.JOptionPane;

/**
 * Write a description of class Test here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */

public class Popup
{

    /**
     * The main method for popup windows
     * 
     * @param  args  An array of Command Line arguments
     * @return     None
     */
    public static void main (String[] args)
    {
        String firstStrNumber, sndStrNumber, thrdStrNumber;
        int firstNumber, secondNumber, thirdNumber;
        int largest = -999999;

        firstStrNumber = JOptionPane.showInputDialog(null, "Enter an integer",
            "Input first number", JOptionPane.QUESTION_MESSAGE);

        sndStrNumber = JOptionPane.showInputDialog(null, "Enter an integer",
            "Input second number", JOptionPane.QUESTION_MESSAGE);

        thrdStrNumber = JOptionPane.showInputDialog(null, "Enter an integer",
            "Input third number", JOptionPane.QUESTION_MESSAGE);

        firstNumber = Integer.parseInt(firstStrNumber);
        secondNumber = Integer.parseInt(sndStrNumber);
        thirdNumber = Integer.parseInt(thrdStrNumber);
        
        largest = firstNumber;
        
        if (secondNumber > largest)
        {
            largest = secondNumber;
        }
        if (thirdNumber > largest)
        {
            largest = thirdNumber;
        }
        
        JOptionPane.showMessageDialog(null, "Largest input value is " + largest);
    }
}
