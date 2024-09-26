package Com.march20.FileHandling;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class PremitiveDataDemo 
{
	public static void main(String[] args) throws IOException
	{
		var file = new FileOutputStream("D:\\FileHandlingFolder\\pOut.txt");
		DataOutputStream dos = new DataOutputStream(file);
		var readFile = new DataInputStream(new FileInputStream("D:\\FileHandlingFolder\\pOut.txt"));
		try(dos;readFile)
		{
			dos.writeByte(11);
			System.out.println("success");
			dos.writeBytes("hello world");
			dos.writeFloat(3.4f);
			
			byte byte1 = readFile.readByte();
			System.out.println(byte1);
			
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
	}

	
}








































































