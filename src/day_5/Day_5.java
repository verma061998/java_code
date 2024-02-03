package day_5;

public class Day_5 {





	public static void main(String[] args) {
	String a[] = {"pqr","qwe","abc","sud","ver","adb"};
	String value ="abc";
	boolean flag = false;
	
	for(String i:a)
	{
		if(i.equals(value))
		{
			System.out.println("String found");
			flag = true;
			break;
    	}}
		if (flag==false)
		{
			System.out.println("String not found");
		
		}
	}
	}


