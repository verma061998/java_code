package java_session7;

public class Student {
	int sid;
	String sname;
	char grade;
	
	Student(int id,String name,char g) //constructer
	{
		sid = id;
		sname = name;
		grade = g;
	}
	void getValue(int id,String name, char g) // method
	{
		sid = id;
		sname = name;
		grade =g;
	}
	void display()
	{
		System.out.println(sid+" "+sname+" "+grade);
	}




	}


