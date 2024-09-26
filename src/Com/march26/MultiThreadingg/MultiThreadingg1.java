package Com.march26.MultiThreadingg;

class MyClass extends Thread
{
	@Override
	public void run()
	{
//		try {
//			Thread.sleep(3000);
//		} catch (InterruptedException e) {
//			e.printStackTrace();
//		}
		System.out.println("Myclass thread is invoked....");
	}
}

public class MultiThreadingg1
{
	public static void main(String[] args) throws InterruptedException
	{
		System.out.println("Main started..");
		MyClass mc = new MyClass();
		System.out.println(mc.isAlive());
		mc.start();
		
		MyClass mc1 = new MyClass();
		Thread.sleep(1000);
		mc1.start();
		System.out.println(mc1.isAlive());
		System.out.println("Main ended...");
		
	}

}
















































































