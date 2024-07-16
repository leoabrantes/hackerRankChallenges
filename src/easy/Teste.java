package easy;

import java.util.Locale;

public class Teste {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
		String a = "Testando nova função";
		System.out.println(a);
//		String b = String.format(a, );
		double c = 3.8899;
		int d = 10000;
		System.out.printf("%.2s\n", a);
		System.out.printf("%03d", d);
//		System.out.printf(a, args)

	}

}
