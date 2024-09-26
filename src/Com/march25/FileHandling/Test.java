package Com.march25.FileHandling;

import java.io.IOException;
import java.io.RandomAccessFile;

class ReadWrite
{
    RandomAccessFile file;

    public ReadWrite(){
    }

    public byte[] read(String filepath, int position, int length) throws IOException 
    {
        file = new RandomAccessFile(filepath, "r");
        file.seek(position);
        byte[] data = new byte[length];
        file.read(data);
        file.close();
        return data;
    }

    
    public void write(String filepath, String data, int position) throws IOException
    {
        file = new RandomAccessFile(filepath, "rw");
        file.seek(position);
        file.write(data.getBytes());
        file.close();
    }
}

public class Test 
{
    private static final String path = "D:\\FileHandlingFolder\\JavaStudent.txt";    
    private static String str = "Hello, world!";

    public static void main(String[] args) 
    {
    	
    	
    	
    	
        try 
        {
            ReadWrite rw = new ReadWrite();
            
            byte[] readData = rw.read(path, 0, (int) rw.file.length());
            System.out.println("Read from file: " + new String(readData));

            rw.write(path, str, 22);
            System.out.println("Data written to file successfully.");

        }
        catch (IOException e)
        {
            System.out.println("An error occurred: " + e.getMessage());
        }
        
    }
}
