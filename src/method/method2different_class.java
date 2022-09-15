package method;

public class method2different_class {

	public static void methodA()
	{
		System.out.println("run program for different class");
	}
	public static void methodB()
	{
		System.out.println("program working");
	}
	public static void main(String[] args)
	{
		System.out.println("program execute here");
		method1.methoda();
		method1.methodb();
		methodA();
		methodB();
		
	}
}


