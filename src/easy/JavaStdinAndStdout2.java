package easy;

import java.util.Locale;
import java.util.Scanner;

public class JavaStdinAndStdout2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);
		
		int i = scan.nextInt();
		double d = scan.nextDouble();
		scan.nextLine();
		String s = scan.nextLine();

		System.out.println("String: " + s);
		System.out.println("Double: " + d);		
		System.out.println("Int: " + i);	
		
		scan.close();


	}

}
