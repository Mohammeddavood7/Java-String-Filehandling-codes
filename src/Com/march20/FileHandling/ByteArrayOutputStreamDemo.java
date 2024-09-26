package Com.march20.FileHandling;

import java.io.ByteArrayOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class ByteArrayOutputStreamDemo 
{
	public static void main(String[] args) throws IOException
	{
		var infile = new FileInputStream("D:\\FileHandlingFolder\\Student.txt");
		
		var f1 = new FileOutputStream("D:\\FileHandlingFolder\\a.txt");
		var f2 = new FileOutputStream("D:\\FileHandlingFolder\\b.txt");
		var f3 = new FileOutputStream("D:\\FileHandlingFolder\\c.txt");
 
		ByteArrayOutputStream bout = new ByteArrayOutputStream();

		
		try(infile)
		{
			int i;
			while((i= infile.read()) != -1)
			{
				bout.write((byte)i);
				
			}
			System.out.println("success");
			 
		  
			
		} 
		catch (Exception e) 
		{
			System.out.println(e.getMessage());
		}
		
		bout.writeTo(f1);
		bout.writeTo(f2);
		bout.writeTo(f3);
		
		
		
	}

	

}























//import java.io.ByteArrayOutputStream;
//import java.io.FileInputStream;
//import java.io.FileOutputStream;
//import java.io.IOException;
//
//public class ByteArrayOutputStreamDemo {
//    public static void main(String[] args) {
//        try {
//            var infile = new FileInputStream("D:\\FileHandlingFolder\\Student.txt");
//            var f1 = new FileOutputStream("D:\\FileHandlingFolder\\a.txt");
//            var f2 = new FileOutputStream("D:\\FileHandlingFolder\\b.txt");
//            var f3 = new FileOutputStream("D:\\FileHandlingFolder\\c.txt");
//
//            // Create a ByteArrayOutputStream object
//            ByteArrayOutputStream bout = new ByteArrayOutputStream();
//
//            // Read from infile and write to bout
//            byte[] buffer = new byte[1024];
//            int bytesRead;
//            while ((bytesRead = infile.read(buffer)) != -1) {
//                bout.write(buffer, 0, bytesRead);
//            }
//
//            // Write the content of bout to each FileOutputStream
//            bout.writeTo(f1);
//            bout.writeTo(f2);
//            bout.writeTo(f3);
//
//            // Close all streams
//            infile.close();
//            f1.close();
//            f2.close();
//            f3.close();
//            bout.close();
//
//            System.out.println("Files written successfully.");
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//    }
//}




















