package Com.march22.SerialiazableQ;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class SerializationExample 
{
	public static void main(String[] args) throws IOException 
	{
		var fos = new FileOutputStream("D:\\FileHandlingFolder\\Person.txt");
		var oos = new ObjectOutputStream(fos);
		try(fos;oos)
		{
			
			oos.writeObject(new Person("Virat", 30,"Virat@example.com"));
			System.out.println("serialized successfully.");
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
		
		var fin = new FileInputStream("D:\\FileHandlingFolder\\Person.txt");
		var ois = new ObjectInputStream(fin);
		Person p = null;
		
		try(fin;ois)
		{
			while((p = (Person)ois.readObject()) != null)
			{
				System.out.println(p);
			}
			
		}
		catch(Exception e)
		{
			System.err.println("stored object is all printed and ended..");
		}
		System.out.println("de-serialized successfully...");

		
		
		
		
		
		
		
		
		
		
	}

}
