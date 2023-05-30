import com.google.gson.Gson;
import json.Number;
import json.OutputJson;

import java.io.File;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        List<Integer> numbers = Utils.readDataFile("data.dat");
        OutputJson out = new OutputJson();
        List<Number> outNums = new ArrayList<>();

        for (int number : numbers) {
            Number num = new Number();
            num.number = number;
            num.isPerfect = Utils.isPerfect(number);
            num.isPrime = Utils.isFirst(number);
            num.isFib = Utils.isFib(number);

            outNums.add(num);
        }

        out.number = outNums.toArray(new Number[0]);

        try {
            File f = new File("out.json");
            FileWriter fw = new FileWriter(f);

            String outputText = new Gson().toJson(out);

            fw.write(outputText);
            fw.close();

            System.out.println("done!");

        } catch (Exception e) {
            e.printStackTrace();
        }



    }
}