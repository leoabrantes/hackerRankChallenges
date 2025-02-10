package easy;


import java.math.BigDecimal;
import java.util.*;


class JavaBigDecimal{
    public static void main(String []args){
    	//Input
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        String []s=new String[n+2];
        for(int i=0;i<n;i++){
            s[i]=sc.next();
        }
        sc.close();
        
        s = Arrays.stream(s)
                .filter(v -> v != null)
                .toArray(String[]::new);
        
         Arrays.sort(s, new Comparator<String>() {
            @Override
            public int compare(String a, String b) {
                BigDecimal numA = new BigDecimal(a);
                BigDecimal numB = new BigDecimal(b);
                return numB.compareTo(numA);
            }
        });
       
       
        //Output
        for(int i=0;i<n;i++)
        {
            System.out.println(s[i]);
        }
    }
}