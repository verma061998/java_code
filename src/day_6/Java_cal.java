package day_6;

public class Java_cal {

 
	int a= 10;
	int b= 20;
	
  void sum()
{
	System.out.println(a+b);
}
  int sum1()
  {
	  return(a+b);
  }
  void sum2(int x,int y)
  {
	  System.out.println(x+y);
  }
  int sum3(int x, int y)
  {
	return(x+y);
  }
public static void main(String[] args){
		Java_cal cal = new Java_cal();
		cal.sum();
		int res = cal.sum1();
		System.out.println(res);
		cal.sum2(2, 3);
		int res1 = cal.sum3(4, 5);
		System.out.println(res1);
}
}