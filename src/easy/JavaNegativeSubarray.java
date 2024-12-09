package easy;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class JavaNegativeSubarray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int length = sc.nextInt();

		int[] array = new int[length];

		for (int i = 0; i < length; i++) {
			array[i] = sc.nextInt();
		}

		System.out.print(countNegative(array));

		sc.close();
	}

	public static int countNegative(int[] array) {

		int count = 0;

		for (int i = 0; i < array.length; i++) {

			int soma = 0;

			for (int j = i; j < array.length; j++) {
				soma += array[j];
				if (soma < 0) {
					count++;
				}
			}
		}

		return count;

	}
}
