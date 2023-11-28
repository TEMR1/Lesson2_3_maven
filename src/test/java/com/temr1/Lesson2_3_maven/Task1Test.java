package com.temr1.Lesson2_3_maven;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class Task1Test {
    Task1 task1;

    @Before
    public void setUp() throws Exception {
        task1 = new Task1();
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void isPalindromeOne() {
        boolean actual = task1.isPalindrome(101);
        boolean exp = true;
        assertEquals(exp, actual);
    }

    @Test
    public void isPalindromeTwo() {
        boolean actual = task1.isPalindrome(256);
        boolean exp = false;
        assertEquals(exp, actual);
    }

    @Test
    public void isPalindromeThree() {
        boolean actual = task1.isPalindrome(2);
        boolean exp = true;
        assertEquals(exp, actual);
    }

    @Test
    public void isPalindromeTFour() {
        boolean actual = task1.isPalindrome(10);
        boolean exp = false;
        assertEquals(exp, actual);
    }

    @Test
    public void isPalindromeTFive() {
        boolean actual = task1.isPalindrome(000);
        boolean exp = true;
        assertEquals(exp, actual);
    }
}