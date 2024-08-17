package easy;

import java.util.Locale;
import java.util.Scanner;

public class javaStringsIntroduction {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
        String A = sc.next();
        String B = sc.next();
        
        
        System.out.println(A.length() + B.length());
        System.out.println(compareTo(A, B));
        System.out.println(formatString(A, B));
        
                
		sc.close();
        
	}
	
	 private static String compareTo(String A, String B) {
		if(A.compareTo(B) > 0) {
			return "Yes";
		}else{
			return "No";
		}
	}


	public static String formatString(String A, String B) {
     	return (A.substring(0, 1).toUpperCase() +  A.substring(1)+ 
     			" " +  B.substring(0, 1).toUpperCase() +  B.substring(1));
     }

       

}
