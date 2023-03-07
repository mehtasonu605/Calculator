package com.example.calculator;


//Class to perform calculation
public class Calculator {

    // Method for Adding two values
    double AddValues(double value1, double value2){
        double Sum = 0;
        Sum = value1 + value2;
        return Sum;
    }

    // Method to subtract two values
    double SubtractValues(double value1, double value2){
        double Difference;
        Difference = value1 - value2;
        return Difference;
    }

    // Method to Multiply two values
    double MultiplyValues(double value1, double value2){
        double Product;
        Product = (value1 * value2);
        return Product;
    }

    // Method to perform division between two values

    double DivideValues(double value1, double value2){
        double Quotient;
        Quotient = (double) (value1/value2);
        return Quotient;
    }

}
