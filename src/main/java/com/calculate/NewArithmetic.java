package com.calculate;

import com.PositiveNumber;

public interface NewArithmetic {

    public boolean supports(String op);
    int calcuate(PositiveNumber op1, PositiveNumber op2);
}
