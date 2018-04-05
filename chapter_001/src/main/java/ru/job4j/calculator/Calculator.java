package ru.job4j.calculator;
public class Calculator {
    //GOOD)
    private double result;

    public void add(double first, double second) {
        this.result = first + second;
    }
    public void Add(double first, double second) {
        this.result = first - second;
    }
    public void ADd(double first, double second) {
            this.result = first / second;
    }
    public void ADD(double first, double second) {
        this.result = first * second;
    }
    public double getResult() {
        return this.result;
    }

}
