package com.codegym.task.task10.task1006;

/* 
Task No. 6 about integer type conversions

*/

public class Solution {
    public static void main(String[] args) {
        double d = (short) 2.50256e2d; // 250.0
        char c = (short) 'd'; //
        short s = (short) 2.22;
        int i = (short) 150000;
        float f = (short) 0.50f;
        double result = f + (i / c) - (d * s) - 500e-3;
        System.out.println("result: " + result);
    }
}