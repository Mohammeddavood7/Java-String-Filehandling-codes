package Com.march21.test;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;

@SuppressWarnings("serial")
class FileReadException extends Exception 
{
    public FileReadException(String message)
    {
        super(message);
    }
}

public class BufferedInputStreamExample 
{
    public void readFile(String fileName) throws FileReadException
    {
        try (BufferedInputStream bis = new BufferedInputStream(new FileInputStream(fileName))) 
        {

            int i;
            while ((i = bis.read()) != -1) 
            {
                System.out.print((char)i);
            }
        } 
        catch (IOException e) 
        {
            throw new FileReadException("Error reading file: " + e.getMessage());
        }
    }

    public static void main(String[] args)
    {
        BufferedInputStreamExample example = new BufferedInputStreamExample();
        try 
        {
            example.readFile("D:\\FileHandlingFolder\\JavaStudent.txt");
        }
        catch (FileReadException e)
        {
            System.err.println("File read error: " + e.getMessage());
        }
    }
}

























