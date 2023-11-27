package com.temr1.Lesson2_3_maven;

import java.util.ArrayList;
import java.util.Collections;

public class Task3 {
    public ArrayList<Integer> task3(int [] firstList, int [] secondList){
        ArrayList<Integer> list = new ArrayList<>();

        for (int elementOfFirstList:firstList)
            list.add(elementOfFirstList);


        for (int elementOfSecondList : secondList)
            list.add(elementOfSecondList);

        Collections.sort(list);

        return list;
    }
}
