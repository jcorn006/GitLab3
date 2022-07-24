package edu.odu.cs;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class IntervalTest {
    @Test
    void testEmpty() {
        Interval intervalTest = new Interval(23.0, 10.0);

        assertTrue(intervalTest.empty());
        assertFalse(!intervalTest.empty());
    }

    @Test
    void testGetMax() {
        Interval intervalTest = new Interval(23.0, 30.0);

        assertEquals(30.0, intervalTest.getMax());
        assertNotEquals(25.0, intervalTest.getMax());

    }

    @Test
    void testGetMin() {
        Interval intervalTest = new Interval(23.0, 30.0);

        assertEquals(23.0, intervalTest.getMin());
        assertNotEquals(25.0, intervalTest.getMin());
    }
}
