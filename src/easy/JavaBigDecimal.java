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
        
        List<String> valores = Arrays.asList();
        for(int i=0; i<n; i++){
            valores.add(s[i]);
            
        }

        valores.sort((a, b) -> {
            Double numA = Double.parseDouble(a);
            Double numB = Double.parseDouble(b);
            return numB.compareTo(numA);
        });

      
        int j= 0;
        for (String valor : valores) {
            s[j] = valor;
            j++;
        }

        //Output
        for(int i=0;i<n;i++)
        {
            System.out.println(s[i]);
        }
    }
}