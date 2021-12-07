package com.advent.days;

import com.advent.FileToArray;

import java.util.Iterator;
import java.util.LinkedList;

public class Day3 {
    public double fifthStar() {
        Object[] objects = FileToArray.fileToStringArray("Day3-input.txt");
        int zerosCount;
        int onesCount;
        long[] gammaArray = new long[12];
        long[] epsilonArray = new long[12];

        for (int i = 0; i < objects[0].toString().length(); i++) {
            onesCount = 0;
            zerosCount = 0;
            for (int j = 0; j < objects.length; j++) {
                String[] splitted = objects[j].toString().split("");
                if (Long.valueOf(splitted[i]) == 1) onesCount++;
                else zerosCount++;
            }
            if (onesCount > zerosCount) {
                gammaArray[i] = 1;
                epsilonArray[i] = 0;
            } else {
                gammaArray[i] = 0;
                epsilonArray[i] = 1;
            }
        }

        String gammaString = "";
        String epsilonString = "";

        for (long n : gammaArray) {
            gammaString = gammaString + n;
        }

        for (long n : epsilonArray) {
            epsilonString = epsilonString + n;
        }

        return Long.parseLong(gammaString, 2) * Long.parseLong(epsilonString, 2);
    }

    public double sixthStar() {
        Object[] objects = FileToArray.fileToStringArray("Day3-input.txt");
        LinkedList<String> numbers = new LinkedList<>();

        for (Object object : objects) {
            numbers.add(object.toString());
        }

        int onesCount;
        int zerosCount;
        String delete = "";
        String oxygenGenerator = "";
        String C02scrubber = "";

        for (int i = 0; i < objects[0].toString().length(); i++) {
            onesCount = 0;
            zerosCount = 0;
            for (String n : numbers) {
                String[] splitted = n.split("");
                if (splitted[i].equals("1")) onesCount++;
                else zerosCount++;
            }

            if (onesCount > zerosCount || onesCount == zerosCount) delete = "0";
            else delete = "1";

            for (Iterator<String> it = numbers.iterator(); it.hasNext();) {
                String next = it.next();
                String[] splitted = next.split("");
                if (splitted[i].equals(delete)) it.remove();
            }
            if (numbers.size() == 1) {
                oxygenGenerator = numbers.getFirst();
                break;
            }
        }

        numbers.clear();
        for (Object object : objects) {
            numbers.add(object.toString());
        }

        for (int i = 0; i < objects[0].toString().length(); i++) {
            onesCount = 0;
            zerosCount = 0;
            for (String n : numbers) {
                String[] splitted = n.split("");
                if (splitted[i].equals("1")) onesCount++;
                else zerosCount++;
            }

            if (onesCount > zerosCount || onesCount == zerosCount) delete = "1";
            else delete = "0";

            for (Iterator<String> it = numbers.iterator(); it.hasNext();) {
                String next = it.next();
                String[] splitted = next.split("");
                if (splitted[i].equals(delete)) it.remove();
            }
            if (numbers.size() == 1) {
                C02scrubber = numbers.getFirst();
                break;
            }
        }

        return Integer.parseInt(oxygenGenerator, 2) * Integer.parseInt(C02scrubber, 2);
    }
}