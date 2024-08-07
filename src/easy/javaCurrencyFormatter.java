package easy;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class javaCurrencyFormatter {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
		 Scanner scanner = new Scanner(System.in);
	        double valor = scanner.nextDouble();
	        
	        System.out.println("Valores esperados: ");
	        System.out.println("US: $12,324.13");
	        System.out.println("India: Rs.12,324.13");
	        System.out.println("China: ￥12,324.13");
	        System.out.println("France: 12 324,13 €");
	        
	        System.out.println();
	        
	        NumberFormat formatoUS = NumberFormat.getCurrencyInstance(Locale.US);
	        NumberFormat formatoCN = NumberFormat.getCurrencyInstance(Locale.CHINA);
	        NumberFormat formatoFR = NumberFormat.getCurrencyInstance(Locale.FRANCE);
	        
	        DecimalFormatSymbols simbolosIN = new DecimalFormatSymbols(new Locale("en", "IN"));
	        simbolosIN.setCurrencySymbol("Rs.");
	        DecimalFormat formatoIN = new DecimalFormat("¤#,##0.00", simbolosIN);

	        // Imprime o valor formatado em diferentes moedas
	        System.out.println("Valor em dólares dos EUA: " + formatoUS.format(valor));
	        System.out.println("Valor em rúpias indianas: " + formatoIN.format(valor));
	        System.out.println("Valor em yuans chineses: " + formatoCN.format(valor));
	        System.out.println("Valor em euros franceses: " + formatoFR.format(valor));

	        scanner.close();
	}

}
