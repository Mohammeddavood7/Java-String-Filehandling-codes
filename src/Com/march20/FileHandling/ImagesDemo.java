package Com.march20.FileHandling;

import java.io.ByteArrayOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class ImagesDemo
{
	public static void main(String[] args) throws IOException
	{
		FileInputStream img1 = new FileInputStream("D:\\FileHandlingFolder\\allah.jpg");
		FileOutputStream newImg1 = new FileOutputStream("D:\\FileHandlingFolder\\Allah1.jpg");
		FileOutputStream newImg2 = new FileOutputStream("D:\\FileHandlingFolder\\Allah2.jpg");
		FileOutputStream newImg3 = new FileOutputStream("D:\\FileHandlingFolder\\Allah3.jpg");
		ByteArrayOutputStream bais = new ByteArrayOutputStream();
		
		try(img1)
		{
			int i ;
			while((i = img1.read()) != -1)
			{
				bais.write((byte)i);
			}
			System.out.println("success");
		  
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
		bais.writeTo(newImg1);
		bais.writeTo(newImg2);
		bais.writeTo(newImg3);
		bais.flush();


		
	}

}


































































