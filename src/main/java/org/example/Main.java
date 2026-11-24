package org.example;

import org.example.Calculator;

public class Main {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        System.out.println("Сума: " + calculator.add(10.0, 5.0));
        System.out.println("Різниця: " + calculator.subtract(10.0, 5.0));
        System.out.println("Добуток: " + calculator.multiply(10.0, 5.0));
        System.out.println("Частка: " + calculator.divide(10.0, 5.0));
    }
}