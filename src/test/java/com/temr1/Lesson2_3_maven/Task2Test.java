package com.temr1.Lesson2_3_maven;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class Task2Test {
    Task2 task2;

    @Before
    public void setUp() throws Exception {
        task2 = new Task2();
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void task2One() {
        int actual = task2.task2("Hello world");
        int exp = 5;
        assertEquals(exp,actual);
    }

    @Test
    public void task2Two() {
        int actual = task2.task2("What is your name");
        int exp = 4;
        assertEquals(exp,actual);
    }

    @Test
    public void task2Three() {
        int actual = task2.task2("");
        int exp = 0;
        assertEquals(exp,actual);
    }

    @Test
    public void task2Four() {
        int actual = task2.task2("   ");
        int exp = 0;
        assertEquals(exp,actual);
    }

    @Test
    public void task2Five() {
        int actual = task2.task2("Hi");
        int exp = 2;
        assertEquals(exp,actual);
    }

    @Test
    public void task2Six() {
        int actual = task2.task2("Hello world   ");
        int exp = 5;
        assertEquals(exp,actual);
    }

    @Test
    public void task2Seven() {
        int actual = task2.task2("Hello   ");
        int exp = 5;
        assertEquals(exp,actual);
    }
}