package Com.march18.Enums;

import java.util.Scanner;

public class Test2
{
	public static void main(String[] args)
	{
		//final byte x = 124;
	    //final int y = 19;
		
		System.out.print("enter the charach [x/y]: ");
		Scanner sc = new Scanner(System.in);
		int charAt = sc.next().charAt(0);
		switch(charAt)
		{
		case 65: System.out.println("val 1 "+charAt); break;
		
		case 97: System.out.println("val 2 "+charAt); break;
		
		default : System.out.println("invalid char ");
		}
		sc.close();
		
	}

}
