package Com.march21.testpractice;

import java.io.File;
import java.io.IOException;

public class FileCheckAndDelete 
{
    public static void main(String[] args) throws IOException 
    {

        File file = new File("D:\\FileHandlingFolder\\file.txt");
        file.createNewFile();
        
        if (file.exists())
        {
            System.out.println("File or directory exists.");
 
            if (file.delete())
            {
                System.out.println("File deleted successfully.");
            } 
            else
            {
                System.out.println("Failed to delete the file.");
            }
        } 
        else 
        {
            System.out.println("File or directory does not exist.");
        }
        
    }
}



































