package easy;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class JavaExceptionHandlingTryCatch {

    public static void main(String[] args) {
       
        Scanner sc = new Scanner(System.in);
       
        try{
        	int x = sc.nextInt();
            int y = sc.nextInt();
            if (y == 0) {
                throw new ArithmeticException("/ by zero");
            }
            if (x >= Integer.MAX_VALUE || x <= Integer.MIN_VALUE || y >= Integer.MAX_VALUE || y <= Integer.MIN_VALUE) {
                throw new ArithmeticException();
            }else {
            	System.out.println(x/y);
            }
        } catch (ArithmeticException e) {
            System.out.println(e.getClass().getName() + ": " + e.getMessage());
        } catch (InputMismatchException e) {
            System.out.println("java.util.InputMismatchException");
        } finally {      
            sc.close();  
        }
    }
}
