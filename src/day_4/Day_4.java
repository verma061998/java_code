package day_4;

public class Day_4 {

	public static void main(String[] args) {
		String s= "elearntesting";
//System.out.println("string lenght is "+s.length());
//String s1 = "My name is";
String s2 = "Sudhanshu verma";
//System.out.println(s1+" "+s2);
//System.out.println(s1.concat(" "+s2));
//System.out.println("My name is".concat(" "+s2));
String s3 = "  verma";
//System.out.println(s3.length());
String s4 =s3.trim();
//System.out.println(s4.length());
String s1 = "My name is";
//System.out.println(s1.charAt(0));
//System.out.println(s1.charAt(3));
//System.out.println(s1.contains("My"));
//System.out.println(s1.contains("my"));
String s5 = "MY NAME IS";
System.out.println(s1.equals(s5));
System.out.println(s1.equalsIgnoreCase(s5));

System.out.println(s1.replace("s", "d"));
System.out.println(s1.substring(4));
System.out.println(s1.toLowerCase());
System.out.println(s1.toUpperCase());


	}

}
