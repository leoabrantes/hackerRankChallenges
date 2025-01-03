package easy;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class JavaHachset {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        String [] pair_left = new String[t];
        String [] pair_right = new String[t];
        
        for (int i = 0; i < t; i++) {
            pair_left[i] = s.next();
            pair_right[i] = s.next();
        }
        
        
        Set<String> valuesDifferent = new HashSet<>();
        
        int[] values = new int[t];
        
        for (int i = 0; i < t; i++) {
        	valuesDifferent.add(pair_left[i] + " " + pair_right[i]);
        	values[i] = valuesDifferent.size();
        }
        
        for (int valor : values) {
        	System.out.println(valor);
        }
    }
}
