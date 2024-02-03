package exception;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Throwskeyword {

	public static void main(String[] args) throws InterruptedException, IOException {

	
			FileReader fr = null;
		fr = new FileReader("F:\\Manual Testing\\test.txt");
	
		
		BufferedReader bfr= new BufferedReader(fr);
		try {
		System.out.print(bfr.readLine());
		}
		catch(IOException e) {
			System.out.println("exception handled");
		}
		
		Thread.sleep(10);
	
		
	}

}
 