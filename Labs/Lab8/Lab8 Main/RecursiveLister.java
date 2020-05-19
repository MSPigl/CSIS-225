import java.io.File;

/**
 * This class recursively prints all absolute file paths for files in current
 * directory, and repeats for any subdirectories
 * 
 * @author Matt Pigliavento, London Brunell 
 * @version 0.1
 */
public class RecursiveLister
{    
    /**
     * Main method for class RecursiveLister
     * 
     * @param args array of command line arguments
     */
    public static void main(String[] args)
    {
        listAll(new File("."));
    }
        
    /**
     * Recursively traverses the directory tree, printing the absolute path
     * for all files encountered
     * 
     * @param file the current File object
     */
    public static void listAll(File file)
    {
        // array Files in the current directory
        File[] fileList = file.listFiles();
        
        for (int i = 0; i < fileList.length; i++)
        {
            // print File at i's absolute path
            System.out.println(fileList[i].getAbsolutePath());
            
            // recurse if File at i is a directory
            if (fileList[i].isDirectory())
            {
                listAll(fileList[i]);
            }
        }
    }
}