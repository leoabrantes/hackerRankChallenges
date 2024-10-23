package easy;
import java.util.Scanner;

public class JavaStringCompare {

    public static String getSmallestAndLargest(String s, int k) {
        String smallest = "";
        String largest = "";
        
        String lex[] = new String[s.length()-k+1];
        
        for(int i=0 ; i < s.length() - (k-1); i++) {
        	
        	if(i<(s.length()-k)) {
        	lex[i] = s.substring(i, i+k);
        	}else if(i==(s.length()-k)){
            	lex[i] = s.substring(i);
            }
        	
        }
        
        for (int i = 0; i < lex.length - 1; i++) {
            for (int j = 0; j < lex.length - 1 - i; j++) {
                
            	if (lex[j].compareTo(lex[j + 1]) > 0) {
                    String temp = lex[j];
                    lex[j] = lex[j + 1];
                    lex[j + 1] = temp;
                }
            }
        }
        
        
        smallest = lex[0];
        largest = lex[s.length() - k];
        
        
        // Complete the function
        // 'smallest' must be the lexicographically smallest substring of length 'k'
        // 'largest' must be the lexicographically largest substring of length 'k'
        
        return smallest + "\n" + largest;
    }


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        int k = scan.nextInt();
        scan.close();
      
        System.out.println(getSmallestAndLargest(s, k));
    }
}