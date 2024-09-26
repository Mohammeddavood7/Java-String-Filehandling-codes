package Com.march19.FileHandling;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileWrite1 {

    public static void main(String[] args) throws IOException 
    {

        FileWriter fw = null;

        try 
        {
            File file = new File("C:\\nit\\Desktop1\\No\\Test02.txt");
            file.createNewFile();

            if (file.exists())
            {
                System.out.println("Success ...!!!");
               fw = new FileWriter(file);
               String str =  "19-03-2024 filehandling in FileWriter";
               fw.write(str);
                System.out.println("Data written to file successfully.");
            } 
            else 
            {
                System.out.println("File does not exist.");
            }
        } 
        catch (IOException e)
        {
            System.out.println("Error: " + e.getMessage());
        }
        finally
        {
            if (fw != null)
            {
                fw.close();
            }
        }
    }
}




































