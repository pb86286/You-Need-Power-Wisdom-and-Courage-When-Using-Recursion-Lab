package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class AppTest {
    @Test
    void testTriangleValue() {
        TriangleNumberCalculator calc = new TriangleNumberCalculator();
        assertEquals(1, calc.value(1));
        assertEquals(3, calc.value(2));
        assertEquals(10, calc.value(4));
    }

    @Test
    void testAdd() {
        TriangleNumberCalculator calc = new TriangleNumberCalculator();
        assertEquals(2, calc.add(1, 1));
        assertEquals(9, calc.add(2, 3));
    }

    @Test
    void testSubtract() {
        TriangleNumberCalculator calc = new TriangleNumberCalculator();
        assertEquals(0, calc.subtract(1, 1));
        assertEquals(7, calc.subtract(4, 2));
    }
}