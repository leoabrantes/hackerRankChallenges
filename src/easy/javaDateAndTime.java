package easy;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Calendar;



class Result {

public static String findDay(int month, int day, int year) {
       
        Calendar calendar = Calendar.getInstance();
        
        calendar.set(Calendar.YEAR, year);
        calendar.set(Calendar.MONTH, month -1); 
        calendar.set(Calendar.DAY_OF_MONTH, day);
      
              
        String[] diasDaSemana = {
                "SUNDAY", "MONDAY", "TUESDAY", "WEDNESDAY", "THURSDAY", "FRIDAY", "SATURDAY"
            };
        
        return diasDaSemana[calendar.get(Calendar.DAY_OF_WEEK) - 1];
    }
        
        
}

public class javaDateAndTime {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        int month = Integer.parseInt(firstMultipleInput[0]);

        int day = Integer.parseInt(firstMultipleInput[1]);

        int year = Integer.parseInt(firstMultipleInput[2]);

        String res = Result.findDay(month, day, year);

        bufferedWriter.write(res);
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
