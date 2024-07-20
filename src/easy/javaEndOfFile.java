package easy;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class javaEndOfFile {

	public static void main(String[] args) {
			
		Scanner sc = new Scanner(System.in);
		
		List<String> num = new ArrayList<>();
		
		int count = 0;
		
		while(sc.hasNextLine()) {
			String line = sc.nextLine();
			if (line.isEmpty()) {
                break;
            }
			num.add(line);
						
		}
		
		int i = 1;
		
		for (String linha : num) {
            System.out.println(i + " " + linha);
            i++;
        }
		
		sc.close();

	}

}
