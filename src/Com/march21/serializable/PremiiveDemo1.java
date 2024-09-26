package Com.march21.serializable;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class PremiiveDemo1
{
	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws IOException
	{
		  var fos = new FileOutputStream("D:\\FileHandlingFolder\\Pmtive.txt"); 
	       var dos = new DataOutputStream(fos);
	       try(fos;dos) 
	       {
	    	   dos.writeByte(Byte.MAX_VALUE);
		       dos.writeShort(Short.MIN_VALUE);
		       dos.writeChar(Character.MIN_VALUE);
		       dos.writeInt(Integer.MIN_VALUE);
		       dos.writeFloat(Float.MIN_VALUE);
		       dos.writeLong(Long.MIN_VALUE);
		       dos.writeDouble(Double.MIN_VALUE);
		       dos.writeBoolean(true);
		       dos.writeBytes("Hi, this is smith");
		       dos.flush();
		   } 
	       catch (Exception e) 
	       {
				e.printStackTrace();
		   }
	       
	       System.out.println("insert the primitive data");
	       
	       var fis = new FileInputStream("D:\\FileHandlingFolder\\Pmtive.txt");
	        var dis = new DataInputStream(fis);
	        
	        
	       try(dis)
	       {
	    	   
	    	   boolean boolean1 = dis.readBoolean();
	    	   byte byte1 = dis.readByte();
	    	   char char1 = dis.readChar();
	    	   short short1 = dis.readShort();
	    	   int int1 = dis.readInt();
	    	   float float1 = dis.readFloat();
	    	   long long1 = dis.readLong();
	    	   double double1 = dis.readDouble();
	    	   String string = dis.readLine();
	    	   
	    	   
	    	   
	    	   System.out.println(boolean1+" : "+byte1+" : "+char1+"  : "+short1+"  : "
	    			   +int1+"  : "+float1+"  : "+long1+"  : "+double1+"  : "+
	    			   string);
	    	   
	    	   
	    	   
	    	   
			  
		   } 
	       catch (Exception e)
	       {
			e.printStackTrace();
		   }
		
		
	}

}






































































