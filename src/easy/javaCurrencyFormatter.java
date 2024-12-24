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
	 double payment = scanner.nextDouble();
     
     // US Locale
           Locale us = Locale.US;
           NumberFormat usFormat = NumberFormat.getCurrencyInstance(Locale.US);
           String usFormatted = usFormat.format(payment);

           // India Locale
           Locale india = new Locale("en", "IN");
           NumberFormat indiaFormat = NumberFormat.getCurrencyInstance(india);
           String indiaFormatted = indiaFormat.format(payment);

           // China Locale
           Locale china = Locale.CHINA;
           NumberFormat chinaFormat = NumberFormat.getCurrencyInstance(Locale.CHINA);
           String chinaFormatted = chinaFormat.format(payment);

           // France Locale
           Locale france = Locale.FRANCE;
           NumberFormat franceFormat = NumberFormat.getCurrencyInstance(Locale.FRANCE);
           String franceFormatted = franceFormat.format(payment);

           // Print results
           System.out.println("US: " + usFormatted);
           System.out.println("India: " + indiaFormatted);
           System.out.println("China: " + chinaFormatted);
           System.out.println("France: " + franceFormatted);
	        
	        
	     

	        scanner.close();
	}

}
