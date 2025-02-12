package easy;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class javaDequeue {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		Deque<Integer> deque = new ArrayDeque<>();
		int n = in.nextInt();
		int m = in.nextInt();

		for (int i = 0; i < n; i++) {
			int num = in.nextInt();
			deque.add(num);
		}
		
		   Set<Integer> uniqueElements = new HashSet<>();
	        Deque<Integer> window = new ArrayDeque<>();
	        int maxUnique = 0;

	        for (int num : deque) {
	            window.addLast(num);
	            uniqueElements.add(num);

	            if (window.size() > m) {
	                int removed = window.removeFirst();
	                
	                if (!window.contains(removed)) {
	                    uniqueElements.remove(removed);
	                }
	            }

	            if (window.size() == m) {
	                maxUnique = Math.max(maxUnique, uniqueElements.size());
	            }
	        }

	        System.out.println(maxUnique);
		
	}
}
