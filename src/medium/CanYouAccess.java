package medium;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.security.Permission;


import java.io.*;
import java.util.*;

public class CanYouAccess {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        
    	Scanner sc = new Scanner(System.in);
    	
    	int num = sc.nextInt();
    	
    	boolean test = powerof2(num);
    	
    	if (test == true) {
    		System.out.printf("%d is power of 2\n", num);
    	} else {
    		System.out.printf("%d is not a power of 2\n", num);
    	}
    	
        System.out.println("An instance of class: Solution.Inner.Private has been created");
        
        sc.close();
    }
    
    static boolean powerof2(int num) {
    	
    	 if(num == 1){
             return true;
             
         } else if (num%2!=0 || num < 1){
             return false;
         }
    	    	
    	while(num!=1){
    		if((num%2)!=0) {
    			return false;
    		}
    		num = num/2;
    		
    	}
    	
    	return true;
    	
    }
}
	
