package com.example.demo;

public class Procent {
    public double countPr(double sum, int pr) {
        return sum * pr/100;
    }
    public double countSum(double sum, int pr) {
        return countPr(sum, pr) + sum;
    }
    public int countSumTrunc(double sum, int pr) {
        return (int)countSum(sum, pr);
    }
}
