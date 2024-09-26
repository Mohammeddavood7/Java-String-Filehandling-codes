package Com.march18.Enums;

enum MyType 
{
ONE 
{
	@Override
    public String toString() 
	{
        return "this is one";
    }
},
 
TWO 
{
	@Override
    public String toString() 
	{
        return "this is two";
    }
}
}
public class Test1
{
	public static void main(String[] args) 
	{
		System.out.println(MyType.ONE);
		
	}
}