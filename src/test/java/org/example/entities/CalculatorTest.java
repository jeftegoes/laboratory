package org.example.entities;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class CalculatorTest {
    @Test
    void testSum() {
        Calculator calculator = new Calculator();
        int result = calculator.sum(1, 3);
        assertEquals(3, result, "Expected sum of 1 and 2 to be 3");
    }
}