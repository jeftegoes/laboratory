package org.example;

import org.example.entities.Calculator;

public class Main {
    static void main() {
        Calculator calculator = new Calculator();
        System.out.println("Result: " + calculator.sum(1, 2));
    }
}
