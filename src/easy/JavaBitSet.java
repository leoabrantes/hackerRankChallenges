package easy;

import java.util.BitSet;
import java.util.Locale;
import java.util.Scanner;

public class JavaBitSet {
	
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int m = sc.nextInt();
		
		BitSet b1 = new BitSet(n);
		BitSet b2 = new BitSet(n);
		
		int[] somaB1 = new int[m];
		int[] somaB2 = new int[m];
		
		for(int i=0; i<m; i++) {
				
				String op = sc.next();
				int fstNum = sc.nextInt();
				int secNum = sc.nextInt();
				sc.nextLine();
				
				switch(op) {
				    case "AND":
				    	if(fstNum==1) {
				    		b1.and(b2);
				    	} else if (fstNum==2) {
				    		b2.and(b1);
				    	}
				    	
				    	break;
				    	
				    case "OR":
				    	if(fstNum==1) {
				    		b1.or(b2);
				    	} else if (fstNum==2) {
				    		b2.or(b1);
				    	}
				    	
				    	break;
				    	
				    case "XOR":
				    	if(fstNum==1) {
				    		b1.xor(b2);
				    	} else if (fstNum==2) {
				    		b2.xor(b1);
				    	}
				    	
				    	break;
				    	
				    case "FLIP":
				    	if(fstNum==1) {
				    		b1.flip(secNum);
				    	} else if (fstNum==2) {
				    		b2.flip(secNum);
				    	}
				    	
				    	break;
				    	
				    case "SET":
				    	if(fstNum==1) {
				    		b1.set(secNum);
				    	} else if (fstNum==2) {
				    		b2.set(secNum);
				    	}
				    	
				    	break;
				
				}
				
				somaB1[i] = b1.cardinality();
				somaB2[i] = b2.cardinality();
						
		}
			
		for(int j=0; j<m; j++) {
				
			System.out.println(somaB1[j] + " " + somaB2[j]);
				
		}
			
	    sc.close();
	    }
	
}
