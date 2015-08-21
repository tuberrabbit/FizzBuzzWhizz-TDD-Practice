package com.thoughtworks.btu.rule;

public class FizzRule implements Rule {
    public static final String FIZZ = "Fizz";
    private static final int DIVISOR_OF_FIZZ = 3;

    @Override
    public boolean isApplicable(Integer number) {
        return number % DIVISOR_OF_FIZZ == 0;
    }

    @Override
    public String getResult() {
        return FIZZ;
    }
}
