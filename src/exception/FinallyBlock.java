package exception;

public class FinallyBlock {

	public static void main(String[] args) {
		
		System.out.println("program start");
		int a=100;
	
		try
		{
		System.out.println(a/0);
		
		}
		
		catch(ArithmeticException e)
			{
			System.out.println("enter into catch block");	
			}
		
		finally
		{
			System.out.println("entered into final block");
		}
	
			System.out.println("stop");
		
	}

}
