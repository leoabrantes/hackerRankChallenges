package easy;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class Teste {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);

		 Scanner scanner = new Scanner(System.in);
	        double payment = scanner.nextDouble();
	        
	        // Formatar para Dólares dos EUA (USD)
	        NumberFormat formatoUS = NumberFormat.getCurrencyInstance(Locale.US); // Para os EUA
	        String formattedUS = formatoUS.format(payment);

	        // Formatar para Rúpias Indianas (INR)
	        Locale indiaLocale = new Locale("en", "IN"); // Locale para a Índia
	        NumberFormat formatoIN = NumberFormat.getCurrencyInstance(indiaLocale); // Para a Índia
	        String formattedIN = formatoIN.format(payment);

	        // Formatar para Yuan Chinês (CNY)
	        Locale chinaLocale = Locale.CHINA; // Locale para a China
	        NumberFormat formatoCN = NumberFormat.getCurrencyInstance(chinaLocale); // Para a China
	        String formattedCN = formatoCN.format(payment);

	        // Formatar para Euro Francês (EUR)
	        Locale franceLocale = Locale.FRANCE; // Locale para a França
	        NumberFormat formatoFR = NumberFormat.getCurrencyInstance(franceLocale); // Para a França
	        String formattedFR = formatoFR.format(payment);

	        // Exibir os valores formatados
	        System.out.println("US: " + formattedUS);     // Dólar dos EUA
	        System.out.println("India: " + formattedIN);   // Rúpias Indianas
	        System.out.println("China: " + formattedCN);   // Yuan Chinês
	        System.out.println("France: " + formattedFR);  // Euro Francês

		scanner.close();

	}

}
