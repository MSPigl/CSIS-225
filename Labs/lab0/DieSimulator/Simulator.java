import java.io.*;
import java.util.Scanner;
import java.util.Random;
import java.math.*;
/**
 * Write a description of class Simulator here.
 * 
 * @author Grant Boughton, Matt Pigliavento 
 * @version 01/18/2017
 */
public class Simulator
{
    public static void main(String[] args)
    {
        try
        {
            Scanner inFile = new Scanner(new File(args[0]));
            int nRolls = Integer.parseInt(args[1]);
            int count = 0;
            while (inFile.hasNextInt())
            {
                count++;
                inFile.nextInt();
            }
            inFile = new Scanner(new File(args[0]));
            int[] dice = new int[count]; 
            System.out.println("Simulation has " + count + " fair dice:");
            int maxSides = 0;
            int highRoll = 0;
            for (int i = 0; i < count; i++)
            {
                int numSides= inFile.nextInt();
                dice[i] = numSides;
                System.out.println("   "+numSides+"-sided");
                highRoll += numSides;
                if(numSides > maxSides)
                {
                    maxSides = numSides;
                }
            }
            Random die = new Random();
            int summary[][] = new int[count][maxSides + 1];
            int sums[] = new int[highRoll+1];
            int finalTotal = 0;
            for (int i = 0; i < nRolls; i++)
            {
                int total = 0;
                System.out.print("Roll " + (i+1) + ": ");              
                for (int j = 0; j < count; j++)
                {
                    int roll = die.nextInt(dice[j]) + 1;
                    System.out.print(roll + " ");
                    total += roll;
                    summary[j][roll]++;
                }
                finalTotal += total;
                sums[total]++;
                System.out.println("total: " + total);
            }
            System.out.println("Simulation Summary:");
            for( int i = 0; i < count;i++){
                System.out.print("Roll counts for "+dice[i] +"-sided die: ");
                for (int j = 1; j <= dice[i];j++){
                    System.out.print(j+":" + summary[i][j]+" ");
                }
                System.out.println();
            }
            System.out.print("Sum counts: ");
            for(int i = count; i<= highRoll;i++){
                System.out.print(i+":"+sums[i]+" ");
            }
            System.out.println();
            double avgTotal = (finalTotal * 1.0)/nRolls;
            System.out.printf("Average roll: %.2f",avgTotal);
        }
        catch (IOException e)
        {
            System.err.println(e);
            System.exit(1);
        }
    }
}
