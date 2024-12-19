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
		String action;
		int index, element;
		
		List<Integer> list = new ArrayList<>();
		
		for(int i = 0 ; i< size; i++) {
			list.add(sc.nextInt());
		}
		
		int q = sc.nextInt();
		
		
			
		for(int i = 0 ; i< q; i++) {
			sc.nextLine();
			action = sc.nextLine();
			
			if(action.equalsIgnoreCase("Insert")) {
				index = sc.nextInt();
				element = sc.nextInt();
				list.add(index, element);
				
			}else if (action.equalsIgnoreCase("Delete")) {
				list.remove(sc.nextInt());
				
			} else {System.out.println("Wrong answer! Next step");}
			
		}
		
		for(int n : list) {
			System.out.print(n + " ");
		}
		
		sc.close();

	}

}
