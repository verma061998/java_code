 package day_5;

public class Swapstring {

	public static void main(String[] args) {
		String s1= "Sudhanshu";
		String s2 = "verma";
		System.out.println("String before swapping....");
		System.out.println("s1 is "+s1);
		System.out.println("s2 is "+s2);
		s1 = s1+s2;
		s2=s1.substring(0, s1.length()-s2.length());
		s1=s1.substring(s2.length(), s1.length());
		System.out.println("String after swapping");
		System.out.println("s1 is "+s1);
		System.out.println("s2 is "+s2);
		
	}

}
