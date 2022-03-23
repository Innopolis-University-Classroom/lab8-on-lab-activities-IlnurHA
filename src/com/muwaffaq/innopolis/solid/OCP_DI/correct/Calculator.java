package com.muwaffaq.innopolis.solid.OCP_DI.correct;

public class Calculator implements ToCalculate {

    public double add(double first, double second) {
        return first + second;
    }

    public double subtract(double first, double second) {
        return first - second;
    }

    public double multiply(double first, double second) {
        return first * second;
    }

    public double divide(double first, double second) {
        return first / second;
    }
}
