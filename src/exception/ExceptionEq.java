package exception;

public class ExceptionEq {

	public static void main(String[] args) {
		System.out.println("program start");
		int a=100;
		int res = 0;
		try
		{
		System.out.println(a/0);
		res = a/0;
		}
		
		catch(ArithmeticException e)
			{
			System.out.println("enter new block");	
			}
		{
			System.out.println(res);
			System.out.println("stop");
		}

	}

}
