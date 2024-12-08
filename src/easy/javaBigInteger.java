package easy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class javaBigInteger {

	public static void main(String[] args) throws IOException {
		 BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
	       
	     String n = bufferedReader.readLine();
	     String m = bufferedReader.readLine();
	     
	     BigInteger a = new BigInteger(n);
	     BigInteger b = new BigInteger(m);
	     
	     BigInteger add = a.add(b);
	     BigInteger multiply = a.multiply(b);
	        
	       System.out.println(add);
	       System.out.print(multiply);
	     
	     bufferedReader.close();
	        
	    }
	

}