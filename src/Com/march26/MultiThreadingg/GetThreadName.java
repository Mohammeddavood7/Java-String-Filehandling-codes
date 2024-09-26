package Com.march26.MultiThreadingg;

public class GetThreadName
{
	public static void main(String[] args)
	{
		
		
		
		Thread thread = Thread.currentThread();
		System.out.println(thread.getName());
		
		System.out.println();
		
		String name = Thread.currentThread().getName();
		System.out.println(name);
	}

}
