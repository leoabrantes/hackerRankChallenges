package easy;

import java.util.Scanner;

public class JavaOutputFormatting {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String a = sc.next();
        int b = sc.nextInt();
        sc.nextLine();
        String c = sc.next();
        int d = sc.nextInt();
        sc.nextLine();
        String e = sc.next();
        int f = sc.nextInt();
        sc.nextLine();
        
        System.out.println("================================");
        
            System.out.printf("%-15.10s%03d\n", a, b);
            System.out.printf("%-15.10s%03d\n", c, d);
            System.out.printf("%-15.10s%03d\n", e, f);
            
        System.out.println("================================");
        
        sc.close();

    }
}



