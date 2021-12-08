package com.advent.days;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.LinkedList;

public class Day4 {
    public long seventhStar() {
        String filePath = new File("").getAbsolutePath();
        filePath = filePath + "/inputs/Day4-input.txt";

        try {
            FileReader file = new FileReader(filePath);
            BufferedReader bufferedReader = new BufferedReader(file);
            String line = bufferedReader.readLine();
            LinkedList<Integer> numbersList = new LinkedList<Integer>();
            String[] numbers;

            String[] bingoNumbersArray = line.split(",");
            line = bufferedReader.readLine();

            while (line != null) {
                    numbers = line.split(" ");
                    if (numbers.length != 1) {
                        for (String n : numbers) {
                            numbersList.add(Integer.parseInt(n));
                        }
                    }

                line = bufferedReader.readLine();
            }

            for (int n : numbersList) {
                System.out.println(n);
            }
        }
        catch (Exception e) {
            e.printStackTrace();
        }
        return 0;
    }
}
