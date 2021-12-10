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
            LinkedList<String> numbersList = new LinkedList<String>();
            String[] numbers;

            String[] bingoNumbersArray = line.split(",");
            line = bufferedReader.readLine();

            while (line != null) {
                    numbers = line.split(" ");
                    if (numbers.length != 1) {
                        for (String n : numbers) {
                            if (!n.equals("")) {
                                numbersList.add(n);
                            }

                        }
                    }

                line = bufferedReader.readLine();
            }

            Object[] numbersArrayCopy = numbersList.toArray();

//            for (Object n : numbersArrayCopy) {
//                System.out.println(Integer.parseInt(n.toString()));
//            }

            int[] resultArray = new int[5];
            String bingoNumber = "";

            outerloop:
            for (int i = 0; i < bingoNumbersArray.length; i++) {
                for (int j = 0; j < numbersList.size(); j++) {
                    if (numbersList.get(j).equals(bingoNumbersArray[i])) {
                        numbersList.set(j, "bingo");
                    }
                    if (numbersList.get(j).equals("bingo")) {
                        if (j % 5 == 0) {
                            if (numbersList.get(j + 1).equals("bingo") && numbersList.get(j + 2).equals("bingo") &&
                                    numbersList.get(j + 3).equals("bingo") && numbersList.get(j + 4).equals("bingo") ) {
                                System.out.println("BINGO " + numbersList.get(j) + " "  + bingoNumbersArray[i]);
                                bingoNumber = bingoNumbersArray[i];
                                resultArray[0] = j;
                                resultArray[1] = j + 1;
                                resultArray[2] = j + 2;
                                resultArray[3] = j + 3;
                                resultArray[4] = j + 4;
                                break outerloop;
                            }
                        }

                        else if (j % 5 == 1) {
                            if (numbersList.get(j - 1).equals("bingo") && numbersList.get(j + 1).equals("bingo") &&
                                    numbersList.get(j + 2).equals("bingo") && numbersList.get(j + 3).equals("bingo") ) {
                                System.out.println("BINGO " + numbersList.get(j) + " "  + bingoNumbersArray[i]);
                                bingoNumber = bingoNumbersArray[i];
                                resultArray[0] = j - 1;
                                resultArray[1] = j;
                                resultArray[2] = j + 1;
                                resultArray[3] = j + 2;
                                resultArray[4] = j + 3;
                                break outerloop;
                            }
                        }

                        else if (j % 5 == 2) {
                            if (numbersList.get(j - 2).equals("bingo") && numbersList.get(j - 1).equals("bingo") &&
                                    numbersList.get(j + 1).equals("bingo") && numbersList.get(j + 2).equals("bingo") ) {
                                System.out.println("BINGO " + numbersList.get(j) + " "  + bingoNumbersArray[i]);
                                bingoNumber = bingoNumbersArray[i];
                                resultArray[0] = j - 2;
                                resultArray[1] = j - 1;
                                resultArray[2] = j;
                                resultArray[3] = j + 1;
                                resultArray[4] = j + 2;
                                break outerloop;
                            }
                        }

                        else if (j % 5 == 3) {
                            if (numbersList.get(j - 3).equals("bingo") && numbersList.get(j - 2).equals("bingo") &&
                                    numbersList.get(j - 1).equals("bingo") && numbersList.get(j + 1).equals("bingo") ) {
                                System.out.println("BINGO " + numbersList.get(j) + " "  + bingoNumbersArray[i]);
                                bingoNumber = bingoNumbersArray[i];
                                resultArray[0] = j - 3;
                                resultArray[1] = j - 2;
                                resultArray[2] = j - 1;
                                resultArray[3] = j;
                                resultArray[4] = j + 1;
                                break outerloop;
                            }
                        }

                        else {
                            if (numbersList.get(j - 4).equals("bingo") && numbersList.get(j - 3).equals("bingo") &&
                                    numbersList.get(j - 2).equals("bingo") && numbersList.get(j - 1).equals("bingo") ) {
                                System.out.println("BINGO " + numbersList.get(j) + " "  + bingoNumbersArray[i]);
                                bingoNumber = bingoNumbersArray[i];
                                resultArray[0] = j - 4;
                                resultArray[1] = j - 3;
                                resultArray[2] = j - 2;
                                resultArray[3] = j - 1;
                                resultArray[4] = j;
                                break outerloop;
                            }
                        }

                        if ((j / 5) % 5 == 0) {
                            if (numbersList.get(j + 5).equals("bingo") && numbersList.get(j + 10).equals("bingo") &&
                                    numbersList.get(j + 15).equals("bingo") && numbersList.get(j + 20).equals("bingo")) {
                                System.out.println("BINGO " + numbersList.get(j) + " "  + bingoNumbersArray[i]);
                                bingoNumber = bingoNumbersArray[i];
                                resultArray[0] = j;
                                resultArray[1] = j + 5;
                                resultArray[2] = j + 10;
                                resultArray[3] = j + 15;
                                resultArray[4] = j + 20;
                                break outerloop;
                            }
                        }

                        else if ((j / 5) % 5 == 1) {
                            if (numbersList.get(j - 5).equals("bingo") && numbersList.get(j + 5).equals("bingo") &&
                                    numbersList.get(j + 10).equals("bingo") && numbersList.get(j + 15).equals("bingo")) {
                                System.out.println("BINGO " + numbersList.get(j) + " "  + bingoNumbersArray[i]);
                                bingoNumber = bingoNumbersArray[i];
                                resultArray[0] = j - 5;
                                resultArray[1] = j;
                                resultArray[2] = j + 10;
                                resultArray[3] = j + 15;
                                resultArray[4] = j + 20;
                                break outerloop;
                            }
                        }

                        else if ((j / 5) % 5 == 2) {
                            if (numbersList.get(j - 10).equals("bingo") && numbersList.get(j - 5).equals("bingo") &&
                                    numbersList.get(j + 5).equals("bingo") && numbersList.get(j + 10).equals("bingo")) {
                                System.out.println("BINGO " + numbersList.get(j) + " "  + bingoNumbersArray[i]);
                                bingoNumber = bingoNumbersArray[i];
                                resultArray[0] = j - 10;
                                resultArray[1] = j - 5;
                                resultArray[2] = j;
                                resultArray[3] = j + 5;
                                resultArray[4] = j + 10;
                                break outerloop;
                            }
                        }

                        else if ((j / 5) % 5 == 3) {
                            if (numbersList.get(j - 15).equals("bingo") && numbersList.get(j - 10).equals("bingo") &&
                                    numbersList.get(j - 5).equals("bingo") && numbersList.get(j + 5).equals("bingo")) {
                                System.out.println("BINGO " + numbersList.get(j) + " "  + bingoNumbersArray[i]);
                                bingoNumber = bingoNumbersArray[i];
                                resultArray[0] = j - 15;
                                resultArray[1] = j - 10;
                                resultArray[2] = j - 5;
                                resultArray[3] = j;
                                resultArray[4] = j + 5;
                                break outerloop;
                            }
                        }

                        else if ((j / 5) % 5 == 4) {
                            if (numbersList.get(j - 20).equals("bingo") && numbersList.get(j - 15).equals("bingo") &&
                                    numbersList.get(j - 10).equals("bingo") && numbersList.get(j - 5).equals("bingo")) {
                                System.out.println("BINGO " + numbersList.get(j) + " " + bingoNumbersArray[i]);
                                bingoNumber = bingoNumbersArray[i];
                                resultArray[0] = j - 20;
                                resultArray[1] = j - 15;
                                resultArray[2] = j - 10;
                                resultArray[3] = j - 5;
                                resultArray[4] = j;
                                break outerloop;
                            }
                        }
                    }
                }
            }

//            for (int n : resultArray) {
//                System.out.println(n);
//            }

            for (int n : resultArray) {
                System.out.println(numbersArrayCopy[n]);
            }

            System.out.println(bingoNumbersArray[Integer.parseInt(bingoNumber)]);
        }
        catch (Exception e) {
            e.printStackTrace();
        }
        return 0;
    }
}
