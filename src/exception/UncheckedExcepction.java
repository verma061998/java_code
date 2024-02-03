package exception;

public class UncheckedExcepction {

	public static void main(String[] args) {
		System.out.println("start");
		int a =10;
		int res= 0;
	//	System.out.print(a/res);
		
		String str = null;
		try {
			System.out.println(str.length());
		}
		catch(NullPointerException e)
		{
			System.out.println("enter into catch block");
		
		
		
		System.out.println("stop");
	}

}
}
