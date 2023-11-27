package com.temr1.Lesson2_3_maven;

public class Task1 {
    public boolean isPalindrome(int userNum){
        if (userNum / 10 == 0)
            return true;

        int num = userNum;
        int reversedNum = 0;
        int tmp;

        while (userNum != 0){
            tmp = userNum % 10;
            reversedNum = reversedNum * 10 + tmp;
            userNum /= 10;
        }

        if (num == reversedNum)
            return true;
        else
            return false;
    }
}
