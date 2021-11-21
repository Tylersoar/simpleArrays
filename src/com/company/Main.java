package com.company;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.List;
import java.util.Collections;

public class Main {
    private static int num1;
    private static int num2;
    private static int num3;
    private static int num4;
    private static int num5;


    public static void main(String[] args) {

        userInput();
        numArray();

    }

    private static void numArray() {
        List<Integer> numberList = new ArrayList<>();
        Collections.addAll(numberList, num1, num2, num3, num4, num5);
        int arraysize = numberList.size();

        double average = (num1 + num2 + num3 + num4 + num5) / arraysize;

        Collections.sort(numberList);
        System.out.println("The lowest number is: " + numberList.get(0) + " The highest number is: " + numberList.get(4));
        System.out.println("The average is: " + average);

    }

    private static void userInput() {
        while (true) {
            try {
                Scanner input = new Scanner(System.in);

                System.out.println("please enter a number");
                num1 = input.nextInt();
                System.out.println("please enter a number");
                num2 = input.nextInt();
                System.out.println("please enter a number");
                num3 = input.nextInt();
                System.out.println("please enter a number");
                num4 = input.nextInt();
                System.out.println("please enter a number");
                num5 = input.nextInt();

                break;

            } catch (Exception e) {
                System.out.println("please enter a valid input: ");
            }


        }
    }
}


