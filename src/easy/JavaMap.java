package easy;

import java.util.*;
import java.io.*;

class JavaMap{
	public static void main(String []argh)
	{
		 Scanner in = new Scanner(System.in);
	        int n=in.nextInt();
	        in.nextLine();
	        Map<String, String> map = new HashMap<>();
	        
	        for(int i=0;i<n;i++)
	        {
	            String name=in.nextLine();
	            String phone=in.nextLine();
	            
	            map.put(name, phone);
	        }
	        
	        while(in.hasNext())
	        {
	            String s = in.nextLine();
	            if(map.containsKey(s)) {
	                System.out.println(s + "=" + map.get(s));
	            } else {
	                System.out.println("Not found");
	            }
	        }
	        
	        in.close();
	        
	    }
}
