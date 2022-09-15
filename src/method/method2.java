package method;

public class method2 {
	 
	public void addition(int a, int b)
	{
		System.out.println(a+b);
	}
	public void multiplication (int a, int b)
	{
		System.out.println(a*b);
		
	}

   public static void main(String[] args) {
	
	   method2 object=new method2();
	   object.addition(5,10);
	   object.multiplication(10, 20);
   }
}
