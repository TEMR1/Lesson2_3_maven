package com.temr1.Lesson2_3_maven;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.Assert.*;

public class Task3Test {
    Task3 task3;

    @Before
    public void setUp() throws Exception {
        task3 = new Task3();
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void task3One() {
        ArrayList<Integer> actual = task3.task3(new int[] {1, 2, 3, 6, 1}, new int[] {8, 0, 2, 4});
        ArrayList<Integer> exp = new ArrayList<>(Arrays.asList(0,1,1,2,2,3,4,6,8));
        assertEquals(exp, actual);
    }

    @Test
    public void task3Two() {
        ArrayList<Integer> actual = task3.task3(new int[] {8, 2, 5, 12, 1}, new int[] {8, 32, 2, 3});
        ArrayList<Integer> exp = new ArrayList<>(Arrays.asList(1,2,2,3,5,8,8,12,32));
        assertEquals(exp, actual);
    }
}