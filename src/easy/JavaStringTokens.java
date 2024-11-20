package easy;

import java.util.Scanner;

public class JavaStringTokens {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        // Write your code here.
        
        String[] n = s.trim().split("[-@!_,\\?\\.'\\s]+") ;
        
        if(n.length==1 && n[0].isEmpty()) {
            System.out.println(0);

        }else {
        System.out.println(n.length);
        }
        
        
        for(String str : n ) {
            System.out.println(str);
        }
        
        // Write your code here.
        scan.close();
	}

}
