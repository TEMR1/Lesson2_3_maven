package com.temr1.Lesson2_3_maven;

public class Task2 {
    public int task2(String userStr){
        int length = 0;

        for (int i = userStr.length() - 1; i >= 0; i--) {
            if (userStr.charAt(i) == ' ' && length == 0) {
                continue;
            }

            if (userStr.charAt(i) != ' ')
                length++;
            else
                break;
        }
        return length;
    }
}
