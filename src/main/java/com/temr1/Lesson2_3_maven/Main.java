package com.temr1.Lesson2_3_maven;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        isPalindrome(141);
        task2("Hello World");
        task3();
    }

    public static void isPalindrome(int userNum){
        if (userNum / 10 == 0)
            System.out.println("Це паліндром");

        int num = userNum;
        int reversedNum = 0;
        int tmp;

        while (userNum != 0){
            tmp = userNum % 10;
            reversedNum = reversedNum * 10 + tmp;
            userNum /= 10;
        }

        if (num == reversedNum)
            System.out.println("Це паліндром");
        else
            System.out.println("Це не паліндром");
    }

    public static void task2(String userStr){
        int length = 0;

        for (int i = userStr.length() - 1; i >= 0; i--) {
            if (userStr.charAt(i) == ' ' && length == 0) {
                continue;
            }

            if (userStr.charAt(i) != ' ')
                length++;
            else
                System.out.println("Довжина останнього слова в строці: " + length);
        }
    }

    public static void task3(){
        Integer [] firstList = {1,3,5,2};
        Integer [] secondList = {2,7,1,0};
        ArrayList<Integer> list = new ArrayList<>();

        list.addAll(Arrays.asList(firstList));
        list.addAll(Arrays.asList(secondList));
        Collections.sort(list);

        System.out.print("Посортований масив: ");

        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " ");
        }
    }
}