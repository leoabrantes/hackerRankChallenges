package easy;

import java.util.Scanner;

public class JavaArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int[][] mat = new int[n][];
		int values, qNum;
		
		for(int i=0; i<n; i++) {
			values = sc.nextInt();
			mat[i] = new int[values];
				for(int j=0; j<values ; j++) {
					mat[i][j] = sc.nextInt();
				}
		}
		
		qNum = sc.nextInt();
		
		int[] x = new int[qNum];
		int[] y = new int[qNum];
		
		for(int i=0; i<qNum; i++) {
			x[i] = sc.nextInt();
			y[i] = sc.nextInt();
		}
		
		
		for(int i=0; i<qNum; i++) {
			try {
				System.out.println(mat[x[i]-1][y[i]-1]);
				
			} catch (ArrayIndexOutOfBoundsException e) {
				System.out.println("ERROR!");
			}
		}
		
		
		sc.close();

	}

}
