package Day2;

public class Quadratic {

	public static void main(String[] args) {

	    double a = 1, b = 1, c = 1;
	    double root1, root2;

	    double determinant = b * b - 4 * a * c;

	    
	    if (determinant >= 0) {

	      root1 = (-b + Math.sqrt(b*b-4*a*c)) / (2 * a);
	      root2 = (-b - Math.sqrt(b*b-4*a*c)) / (2 * a);

	      System.out.println("root1= " +root1);
	      System.out.println("root2= " +root2);
	    }

	    
	   else if (determinant == 0) {
		
	
	     double root =-b / (2 * a);
	      System.out.println("root="+root);
	    }

	     else {

	      double real = -b / (2 * a);
	      double imaginary = Math.sqrt(-determinant) / (2 * a);
	      System.out.print("root1="+real);
	      System.out.print("+i");
	      System.out.println(imaginary);
          System.out.print("root2="+ real);
	      System.out.print("-i");
	      System.out.println(imaginary);



	}

}
}
