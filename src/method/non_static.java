package method;

public class non_static {

	public void method6()
	{
		System.out.println("non static method from same class");
	}
	public void method7()
	
	{
		System.out.println("non static method run");
	}
	public static void main(String[] args)
	{
		
		non_static object = new non_static();
		object.method6();
		object.method7();
		System.out.println("program of non static is correct");
		
		
}
}