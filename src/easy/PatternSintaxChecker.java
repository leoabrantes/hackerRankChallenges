package easy;
import java.util.Scanner;
import java.util.regex.*;

public class PatternSintaxChecker {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		int testCases = Integer.parseInt(in.nextLine());
		String[] str = new String[testCases];
		
		for(int i = 0 ; i < testCases ; i++) {
			String pattern = in.nextLine();
          	
			str[i] = pattern;
		}	
			
		for (String s : str) {
			
			 try {
		            Pattern.compile(s);
		            System.out.println("Valid");
		        } catch (PatternSyntaxException e) {
		            System.out.println("Invalid");
		        }
		}

		in.close();
	}
		
}