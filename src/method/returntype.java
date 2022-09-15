package method;
public class returntype 
{
	public static int returnNumber()
	{
		int empID=201;
		return empID;
	}
	public static void main(String[] args) {
	int empID= returnNumber();
	System.out.println(empID);
	}
}
