package com.advent.day1;

import com.advent.FileToIntArray;

public class Day1 {
    private int mResult = 0;
    public int firstStar() {
        Object[] objects = FileToIntArray.fileToArray("Day1-input.txt");

        for (int i = 0; i < objects.length -1; i++) {
            if ((int) objects[i + 1] > (int) objects[i]) mResult++;
        }
        return mResult;
    }

    public int secondStar() {
        Object[] objects = FileToIntArray.fileToArray("Day1-input.txt");

        for (int i = 0; i < objects.length - 3; i++) {
            if ((int) objects[i + 3] > (int) objects[i]) mResult++;
        }
        return mResult;
    }
}
