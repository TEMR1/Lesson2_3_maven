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

    @Test
    public void task3Three() {
        ArrayList<Integer> actual = task3.task3(new int[] {11}, new int[] {2,5});
        ArrayList<Integer> exp = new ArrayList<>(Arrays.asList(2,5,11));
        assertEquals(exp, actual);
    }

    @Test
    public void task3Four() {
        ArrayList<Integer> actual = task3.task3(new int[] {}, new int[] {});
        ArrayList<Integer> exp = new ArrayList<>(Arrays.asList());
        assertEquals(exp, actual);
    }

    @Test
    public void task3Five() {
        ArrayList<Integer> actual = task3.task3(new int[] {2,3,4}, new int[] {});
        ArrayList<Integer> exp = new ArrayList<>(Arrays.asList(2,3,4));
        assertEquals(exp, actual);
    }

    @Test
    public void task3Six() {
        ArrayList<Integer> actual = task3.task3(new int[] {6,2,11,0}, new int[] {});
        ArrayList<Integer> exp = new ArrayList<>(Arrays.asList(0,2,6,11));
        assertEquals(exp, actual);
    }

    @Test
    public void task3Seven() {
        ArrayList<Integer> actual = task3.task3(new int[] {}, new int[] {3,6,1,0});
        ArrayList<Integer> exp = new ArrayList<>(Arrays.asList(0,1,3,6));
        assertEquals(exp, actual);
    }

    @Test
    public void task3Eight() {
        ArrayList<Integer> actual = task3.task3(new int[] {}, new int[] {1,2,3});
        ArrayList<Integer> exp = new ArrayList<>(Arrays.asList(1,2,3));
        assertEquals(exp, actual);
    }

    @Test
    public void task3Nine() {
        ArrayList<Integer> actual = task3.task3(new int[] {}, new int[] {1});
        ArrayList<Integer> exp = new ArrayList<>(Arrays.asList(1));
        assertEquals(exp, actual);
    }

    @Test
    public void task3Ten() {
        ArrayList<Integer> actual = task3.task3(new int[] {6}, new int[] {});
        ArrayList<Integer> exp = new ArrayList<>(Arrays.asList(6));
        assertEquals(exp, actual);
    }

    @Test
    public void task3Eleven() {
        ArrayList<Integer> actual = task3.task3(new int[] {6}, new int[] {2});
        ArrayList<Integer> exp = new ArrayList<>(Arrays.asList(2,6));
        assertEquals(exp, actual);
    }

    @Test
    public void task3Twelve() {
        ArrayList<Integer> actual = task3.task3(new int[] {1}, new int[] {11});
        ArrayList<Integer> exp = new ArrayList<>(Arrays.asList(1,11));
        assertEquals(exp, actual);
    }
}