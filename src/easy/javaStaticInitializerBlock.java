package easy;

import java.util.Locale;
import java.util.Scanner;

public class javaStaticInitializerBlock {

static Scanner sc = new Scanner(System.in);

public static int B = sc.nextInt();
public static int H = sc.nextInt();
public static boolean flag;


static {
if(B<=0||H<=0) {
	System.out.print("java.lang.Exception: Breadth and height must be positive");
	}else {
		flag= true;}
}

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		if(flag){
			int area=B*H;
			System.out.print(area);
		}
		
	}//end of main

}//end of class