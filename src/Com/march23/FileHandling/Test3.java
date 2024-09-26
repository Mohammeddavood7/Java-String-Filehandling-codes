package Com.march23.FileHandling;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Test3
{
    public static void main(String args[]) throws IOException
    {	 
        String str;
        BufferedReader obj = new BufferedReader(new InputStreamReader(System.in));
        do
        {
            str = (String)obj.readLine();
        System.out.print(str);
        } while(!str.equals("strong"));
    }
}

