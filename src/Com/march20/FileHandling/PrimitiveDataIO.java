package Com.march20.FileHandling;

import java.io.DataOutputStream;
import java.io.IOException;

import java.io.*;

public class PrimitiveDataIO {
    public static void main(String[] args)
    {
        // Write data to file
        try (DataOutputStream outputStream = new DataOutputStream(new FileOutputStream("data.dat"))) {
            outputStream.writeInt(42);
            outputStream.writeDouble(3.14);
            outputStream.writeBoolean(true);
            outputStream.writeUTF("Hello, World!");
        } catch (IOException e) {
            e.printStackTrace();
        }
        
        // Read data from file
        try (DataInputStream inputStream = new DataInputStream(new FileInputStream("data.dat"))) {
            int intValue = inputStream.readInt();
            double doubleValue = inputStream.readDouble();
            boolean booleanValue = inputStream.readBoolean();
            String stringValue = inputStream.readUTF();
            
            // Display read data
            System.out.println("Int Value: " + intValue);
            System.out.println("Double Value: " + doubleValue);
            System.out.println("Boolean Value: " + booleanValue);
            System.out.println("String Value: " + stringValue);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
