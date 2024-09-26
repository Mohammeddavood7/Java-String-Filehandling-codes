package Com.march22.classonSerializationn;
//{
//	public static void main(String[] args)
//	{
//	   for(int i = 5 ; i >= 1 ; i--)
//	   {
//		   for(int j=1 ; j <= i;++j )
//		   {
//			   System.out.print(" * ");
//			   
//		   } 
//		   System.out.println();
//	   }
//		
//	}
//
//}

import java.util.Scanner;

public class ReverseTriangle 
{
    @SuppressWarnings("resource")
	public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int rows = scanner.nextInt();
       reverseTriangle(rows);
        straightTriangle(rows);
    }
    
    

    
    public static void straightTriangle(int rows)
    {

    	        int spaces = rows - 1;
    	        for (int i = 1; i <= rows; i++)
    	        {
    	            for (int j = 1; j <= spaces; j++)
    	            {
    	                System.out.print(" ");
    	            }

    	      
    	            for (int k = 1; k <= 2 * i - 1; k++) 
    	            {
    	                System.out.print("*");
    	            }

    	            System.out.println();
    	            spaces--;
    	        }
     }
   
    
    
    
    
    
  public static void reverseTriangle(int rows)
  {
      for (int i = rows; i >= 1; i--)
      {
          for (int j = 0; j < rows - i; j++)
          {
              System.out.print(" ");
          }
          
          for (int j = 0; j < 2 * i - 1; j++) 
          {
              System.out.print("*");
          }
          
          System.out.println();
      }
  }
  
  
  
  
  
}
    
    
    
    
    

    
    
  
    
    
























































