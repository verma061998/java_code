package java_session7;

public class ConstructerDemo {
	int a;
	int b;
	ConstructerDemo()//default constructor
	{
		a= 10;
		b=20;
	}
	
	ConstructerDemo(int x,int y)
	{
		a =x;
		b =y;
	}
	void display()
	{
		System.out.println(a+b);
	}
	

	public static void main(String[] args) {
	ConstructerDemo sum1 = new ConstructerDemo();
	ConstructerDemo sum2 = new ConstructerDemo(100, 200);
	sum1.display();
	sum2.display();

	}

}
