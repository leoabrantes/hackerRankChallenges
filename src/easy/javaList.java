package easy;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class javaList {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int size = sc.nextInt();
		
		List<Integer> list = new ArrayList<>();
		
		for(int i = 0 ; i< size; i++) {
			
			list.add(sc.nextInt());
			
		}
		
		int q = sc.nextInt();
		sc.nextLine();
		
		for(int i = 0 ; i< q; i++) {
			String action = sc.nextLine();
			if(action == "Insert") {
				
				list.add(sc.nextInt(), sc.nextInt());
				
			}else if (action == "Delete") {
				
				list.remove(sc.nextInt());
				
			}
			
		}
		
		for(int n : list) {
			System.out.print(n + " ");
			
		}
		
		
		
		sc.close();

	}

}
