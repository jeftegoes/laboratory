package org.example.entities;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTest {
    @Test
    void testSum() {
        Calculator calculator = new Calculator();
        int result = calculator.sum(1, 2);
        assertEquals(3, result, "Expected sum of 1 and 2 to be 3");
    }
}