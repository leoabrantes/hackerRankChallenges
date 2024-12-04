package easy;
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;


public class JavaPrimalityTest {
	
	public static void main(String[] args) throws IOException {
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        String n = bufferedReader.readLine();
        
        if(verify(n)) {
            System.out.print("prime");
            
        }else {
            System.out.println("not prime");
        }

        bufferedReader.close();
   
    }
    
    public static boolean verify(String n) {
        
        BigInteger prime = new BigInteger(n);        
        int certainty = 15;
        boolean verify = prime.isProbablePrime(certainty);
        if (verify) {
        return true;
        }else {
            return false;
        }
    
    }
}