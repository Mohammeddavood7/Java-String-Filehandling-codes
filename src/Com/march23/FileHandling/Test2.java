package Com.march23.FileHandling;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.stream.Stream;

public class Test2
{
	public static void main(String args[]) throws IOException
     		{
		   char c;
		   BufferedReader obj = new BufferedReader(new InputStreamReader(System.in));
		      do
			{
			 c = (char) obj.read();
  			 System.out.print(c);
			} while(c!='/');
		}
}
