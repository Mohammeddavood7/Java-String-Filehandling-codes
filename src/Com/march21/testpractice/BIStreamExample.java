package Com.march21.testpractice;

import java.io.FileInputStream;
import java.io.IOException;

/*
 *  Java Program with BufferedInputStream and Custom Exception Handling



    You are tasked with developing a Java program that reads data from a file using BufferedInputStream 
    and includes custom exception handling to manage potential errors during the file reading process.



    Define a custom exception class named FileReadException to handle errors that may occur during file reading operations. 
    This class should extend the Exception class and include a constructor that accepts a String parameter for the error message.

    

    Implement a method named readFile in the BufferedInputStreamExample class. This method should:

    Accept a String parameter fileName representing the name of the file to be read.

    Use a BufferedInputStream to read data from the specified file.

    Print the content of the file to the console.

    Handle any potential IOException by throwing a FileReadException with an appropriate error message.



    Write the main method in the BufferedInputStreamExample class to:

    Create an instance of the BufferedInputStreamExample class.

    Attempt to read data from a file named example.txt using the readFile method.

    Handle any FileReadException that may occur by printing the error message to the console.


 */

@SuppressWarnings("serial")
class FileReadException extends Exception
{
	public FileReadException()
	{
		super();
	}
	
	public FileReadException(String errorMsg)
	{
		super(errorMsg);
	}

}


class BufferedInputStream
{
	
	public void readFile(String fileName) throws FileReadException
	{	
	   
		try(var fin = new FileInputStream(fileName);)
		{
			
			int i;
			while((i = fin.read()) != -1)
			{
				System.out.print((char)i);
			}
			
		}
		catch(IOException e)
		{
			
			throw new FileReadException("GIVEN FILE NOT FOUND //SOMETHING WENT "+e.getMessage());
		}
		
		
	}
}

public class BIStreamExample
{
	public static void main(String[] args) throws FileReadException
	{
		try 
		{
		    new BufferedInputStream().readFile("D:\\FileHandlingFolder\\JavaStudent.txt");
		}
		catch (FileReadException e)
		{
			System.err.println(e.getMessage());
		}
		
	}
}











































