package com.advent;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;

public class FileToIntArray {
    public static Object[] fileToArray(String path) {
        try {
            String filePath = new File("").getAbsolutePath();
            filePath = filePath + "/inputs/" + path;

            FileReader file = new FileReader(filePath);
            BufferedReader bufferedReader = new BufferedReader(file);
            String line = bufferedReader.readLine();

            ArrayList<Integer> numbers = new ArrayList<Integer>();
            int number;

            while (line != null) {
                numbers.add(Integer.parseInt(line));
                line = bufferedReader.readLine();
            }

            Object[] objects = numbers.toArray();
            return objects;
        }

        catch(Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
