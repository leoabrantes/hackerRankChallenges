package easy;

import java.util.Scanner;

public class javaLambdaExpressions {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
			
		int rounds = sc.nextInt();
		
		for(int i = 0 ; i<rounds; i++) {
			
			int option = sc.nextInt();
			
			if(option == 1) {
				isOdd(option);
				
			}else if(option == 2){
				isPrime(option);
				
			}else if(option == 3){
				isPalindrome(option);
				
			}
			
		
		
		}
		
		
		
		
		
			
		sc.close();
		
	}
	

	public static void isOdd(int option) {
		if(option % 2 == 0) {
			System.out.println("EVEN");
		}else {
			System.out.println("ODD");
		}
		
	}
	
	public static void isPrime(int option) {
		if(option <= 1) {
			System.out.println("COMPOSITE");
		}else if(option <= 1){
			System.out.println("ODD");
		}
		
	}
	
	private static void isPalindrome(int option) {
		
	}
	
	

}
