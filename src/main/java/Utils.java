import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Utils {

    public static List<Integer> readDataFile(String filename) {
        List<Integer> output = new ArrayList<>();
        try {
            File data = new File(filename);
            FileReader fileIn = new FileReader(data);
            BufferedReader bufferedReader = new BufferedReader(fileIn);

            String buff = "";
            while ((buff = bufferedReader.readLine()) != null) {
                output.add(Integer.parseInt(buff));
            }


            fileIn.close();
            bufferedReader.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

        return output;
    }

    public static boolean isPerfect(int n) {
        int sum = 0;

        for (int i = 1; i < n; i++) {
            if(n%i==0)
                sum += i;
        }

        return sum == n;
    }

    public static boolean isFirst(int n) {
        for (int i = 1; i < n; i++)
            if (n%2 == 0)
                return true;

        return false;
    }

    public static boolean isFib(int n) {
        double X1 = 5 * Math.pow(n, 2) + 4;
        double X2 = 5 * Math.pow(n, 2) - 4;

        long X1_sqrt = (long)Math.sqrt(X1);
        long X2_sqrt = (long)Math.sqrt(X2);

        return (X1_sqrt*X1_sqrt == X1) || (X2_sqrt*X2_sqrt == X2) ;
    }

}
