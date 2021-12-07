package com.advent;

import com.advent.days.Day1;
import com.advent.days.Day2;
import com.advent.days.Day3;

public class Main {

    public static void main(String[] args) {
        Day1 day1 = new Day1();
        System.out.println(day1.firstStar());
        System.out.println(day1.secondStar());

        Day2 day2 = new Day2();
        System.out.println(day2.thirdStar());
        System.out.println(day2.fourthStar());

        Day3 day3 = new Day3();
        System.out.println(day3.fifthStar());
        System.out.println(day3.sixthStar());
    }
}
