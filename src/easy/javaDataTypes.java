package easy;

import java.util.Locale;
import java.util.Scanner;

public class javaDataTypes {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int t = sc.nextInt();
		sc.nextLine();

		String[] v = new String[t];

		for (int i = 0; i < t; i++) {
			v[i] = sc.nextLine();
		}
		
		for (int ii = 0; ii < t; ii++) {

			try {
				long x = (long) Long.parseLong(v[ii]);
				System.out.println(x + " can be fitted in:");

				if (x >= Byte.MIN_VALUE && x <= Byte.MAX_VALUE) {
					System.out.println("* byte");

				} 
				if (x >= Short.MIN_VALUE && x <= Short.MAX_VALUE) {
					System.out.println("* short");

				} 
				if (x >= Integer.MIN_VALUE && x <= Integer.MAX_VALUE) {
					System.out.println("* int");

				} 
				if (x >= Long.MIN_VALUE  && x <= Long.MAX_VALUE) {
					System.out.println("* long");

				}
			} catch (Exception e) {
				System.out.println(v[ii] + " can't be fitted anywhere.");
			}
			
		}
		sc.close();

	}
}