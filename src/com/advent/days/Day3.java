package com.advent.days;

import com.advent.FileToArray;

public class Day3 {
    public double fifthStar() {
        Object[] objects = FileToArray.fileToStringArray("Day3-input.txt");
        int zerosCount;
        int onesCount;
        long[] gammaArray = new long[12];
        long[] epsilonArray = new long[12];
        double gamma = 0;
        double epsilon = 0;

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

        int k = 0;
        for (int i = gammaArray.length - 1; i >= 0; i--) {
            if (gammaArray[i] == 1) gamma = gamma + Math.pow(2, k);
            k++;
        }
        k = 0;
        for (int i = epsilonArray.length - 1; i >= 0; i--) {
            if (epsilonArray[i] == 1) epsilon = epsilon + Math.pow(2, k);
            k++;
        }

        System.out.println(gamma);
        System.out.println(epsilon);
        return gamma * epsilon;
    }

    public double sixthStar() {
        Object[] objects = FileToArray.fileToStringArray("Day3-input.txt");

        

        return 0;
    }
}