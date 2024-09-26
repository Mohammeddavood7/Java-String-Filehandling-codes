package Com.march20.filehandlingAFFF;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Test2 
{
	public static void main(String[] args) throws IOException
	{                                  //String str = null
	     FileOutputStream fos = new FileOutputStream("D:\\Aff\\Student.txt");
	     
	     
	     FileInputStream fis = new FileInputStream("D:\\Aff\\Student.txt");
	     
	     
	     String str = "Create a file called Student.txt using FileOutputStream class and \r\n"
	     		+ "write some data to the file using write() method.\r\n"
	     		+ "\r\n"
	     		+ "Read the data from Student.txt using FileInputStream class and  \r\n"
	     		+ "print the data in the console as well as write the data to another file called JavaStudent.txt.\r\n";
	      
	     byte[] b = str.getBytes();
	     fos.write(b);
	     System.out.println("success");
	       
	      int i;
	       while((i = fis.read()) != -1) 
	       {
	    	   System.out.print((char)i);
	       }
	     
	}

}
