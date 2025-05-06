package com.calculate;

import com.PositiveNumber;

public class Mul implements NewArithmetic {
    @Override
    public boolean supports(String op) {
        return op.equals("*");
    }

    @Override
    public int calcuate(PositiveNumber op1, PositiveNumber op2) {
        return op1.toInt() * op2.toInt();
    }
}
