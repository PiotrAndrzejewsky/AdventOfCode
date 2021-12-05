package com.advent.days;

import com.advent.FileToArray;

public class Day1 {
    private int mResult = 0;
    public int firstStar() {
        Object[] objects = FileToArray.fileToLongArray("Day1-input.txt");

        for (int i = 0; i < objects.length -1; i++) {
            if ((Long) objects[i + 1] > (Long) objects[i]) mResult++;
        }
        return mResult;
    }

    public int secondStar() {
        Object[] objects = FileToArray.fileToLongArray("Day1-input.txt");

        for (int i = 0; i < objects.length - 3; i++) {
            if ((Long) objects[i + 3] > (Long) objects[i]) mResult++;
        }
        return mResult;
    }
}
