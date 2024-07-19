package easy;

import java.util.Locale;
import java.util.Scanner;

public class JavaLoops2 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);

		Scanner sc = new Scanner(System.in);

		int q = sc.nextInt();

		int[][] v = new int[q][3];

		for (int i = 0; i < q; i++) {
			for (int j = 0; j < 3; j++) {
				v[i][j] = sc.nextInt();
			}
		}

		for (int ii = 0; ii < q; ii++) {

			int s = (int) (v[ii][0] + Math.pow(2, 0) * v[ii][1]);

			for (int jj = 1; jj <= v[ii][2]; jj++) {

				System.out.print(s + " ");

				s += (int) (Math.pow(2, jj) * v[ii][1]);

			}

			System.out.println();

		}

		sc.close();
	}

}
