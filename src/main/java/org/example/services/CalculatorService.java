package org.example.services;

public class CalculatorService {

    public static int addTwoNumbers(int a, int b){
        return a + b;
    }

    public static int productTwoNumbers(int a, int b) {
        return a * b;
    }

    public static double divideTwoNumber(int a, int b) {
        return a / b;
    }

    public static int sumAnyNUmbers(int ...numbers) {
        int s = 0;
        for(int n: numbers) {
            s+=n;
        }
        return s;
    }
}
