package com.advent.days;

import com.advent.FileToArray;

public class Day2 {
    private int mHorizontal = 0;
    private int mDepth = 0;
    private int mAim = 0;
    private String[] mStrings = new String[2];

    public int thirdStar() {
        Object[] objects = FileToArray.fileToStringArray("Day2-input.txt");

        for (int i = 0; i < objects.length; i++) {
            if (((String) objects[i]).contains("forward")) {
                mStrings = ((String) objects[i]).split(" ");
                mHorizontal = mHorizontal + Integer.parseInt(mStrings[1]);
            }
            else if (((String) objects[i]).contains("down")) {
                mStrings = ((String) objects[i]).split(" ");
                mDepth = mDepth + Integer.parseInt(mStrings[1]);
            }

            else if (((String) objects[i]).contains("up")) {
                mStrings = ((String) objects[i]).split(" ");
                mDepth = mDepth - Integer.parseInt(mStrings[1]);
            }
        }

        return mHorizontal * mDepth;
    }

    public int fourthStar() {
        Object[] objects = FileToArray.fileToStringArray("Day2-input.txt");

        for (int i = 0; i < objects.length; i++) {
            if (((String) objects[i]).contains("forward")) {
                mStrings = ((String) objects[i]).split(" ");
                mHorizontal = mHorizontal + Integer.parseInt(mStrings[1]);
                mDepth = mDepth + mAim * Integer.parseInt(mStrings[1]);
            }
            else if (((String) objects[i]).contains("down")) {
                mStrings = ((String) objects[i]).split(" ");
                mAim = mAim + Integer.parseInt(mStrings[1]);
            }

            else if (((String) objects[i]).contains("up")) {
                mStrings = ((String) objects[i]).split(" ");
                mAim = mAim - Integer.parseInt(mStrings[1]);
            }
        }

        return mHorizontal * mDepth;
    }
}
