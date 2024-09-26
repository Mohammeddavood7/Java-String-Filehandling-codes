package Com.march23.FileHandling;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
public class Test1 
{
    @SuppressWarnings("resource")
	public static void main(String args[]) throws IOException 
    {
        File obj = new File("C:/FileHandlingFolder\\system1.txt\\");
        FileOutputStream fileOutputStream = new FileOutputStream(obj);
        String str="Hello67890    1234567890";
        byte[] bytes = str.getBytes();
        fileOutputStream.write(bytes);
        System.out.print(obj.canWrite());
        System.out.print("" + obj.canRead());
        FileInputStream fis=new FileInputStream(obj);
        int available = fis.available();
        System.out.println(available);

       // System.out.print(obj.getName());
    }
}





















































