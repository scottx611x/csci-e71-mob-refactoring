package com.harvard.edu.mob;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class RomanTest {
    @Test
    public void junitWorks() {
        assertTrue(true);
    }

    @Test
    public void convertIto1() {
        assertEquals(1, Roman.convert("I"));
    }

    @Test
    public void convertVto5() {
        assertEquals(5, Roman.convert("V"));
    }

    @Test
    public void convertXto10() {
        assertEquals(10, Roman.convert("X"));
    }

    @Test
    public void convertLto50() {
        assertEquals(50, Roman.convert("L"));
    }

    @Test
    public void convertCto100() {
        assertEquals(100, Roman.convert("C"));
    }

    @Test
    public void convertDto500() {
        assertEquals(500, Roman.convert("D"));
    }

    @Test
    public void convertMto1000() {
        assertEquals(1000, Roman.convert("M"));
    }

    @Test
    public void convertIIto2() {
        assertEquals(2, Roman.convert("II"));
    }

    @Test
    public void convertIIIto3() {
        assertEquals(3, Roman.convert("III"));
    }

    @Test
    public void convertVIto6() {
        assertEquals(6, Roman.convert("VI"));
    }

    @Test
    public void convertVIIto7() {
        assertEquals(7, Roman.convert("VII"));
    }

    @Test
    public void convertVIIIto8() {
        assertEquals(8, Roman.convert("VIII"));
    }

    @Test
    public void convertXIto11() {
        assertEquals(11, Roman.convert("XI"));
    }

    @Test
    public void convertXIIto12() {
        assertEquals(12, Roman.convert("XII"));
    }

    @Test
    public void convertMMMDCCCLXXXVIIIto3888() {
        assertEquals(3888, Roman.convert("MMMDCCCLXXXVIII"));
    }

    @Test
    public void convertIVto4() {
        assertEquals(4, Roman.convert("IV"));
    }
}