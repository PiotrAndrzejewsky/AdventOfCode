package com.advent;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;

public class FileToArray {

    public static Object[] fileToLongArray(String path) {
        try {
            String filePath = new File("").getAbsolutePath();
            filePath = filePath + "/inputs/" + path;

            FileReader file = new FileReader(filePath);
            BufferedReader bufferedReader = new BufferedReader(file);
            String line = bufferedReader.readLine();

            ArrayList<Long> numbers = new ArrayList<Long>();

            while (line != null) {
                numbers.add(Long.valueOf(line));
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

    public static Object[] fileToStringArray(String path) {
        try {
            String filePath = new File("").getAbsolutePath();
            filePath = filePath + "/inputs/" + path;

            FileReader file = new FileReader(filePath);
            BufferedReader bufferedReader = new BufferedReader(file);
            String line = bufferedReader.readLine();

            ArrayList<String> input = new ArrayList<String>();

            while (line != null) {
                input.add(line);
                line = bufferedReader.readLine();
            }

            Object[] objects = input.toArray();
            return objects;
        }

        catch(Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
