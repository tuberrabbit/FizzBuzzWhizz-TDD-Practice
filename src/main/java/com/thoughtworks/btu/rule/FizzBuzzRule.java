package com.thoughtworks.btu.rule;

public class FizzBuzzRule implements Rule {
    public static final String FIZZ_BUZZ = "FizzBuzz";
    private static final Integer DIVISOR_OF_FIZZ_BUZZ = 15;

    @Override
    public boolean isApplicable(Integer number) {
        return number % DIVISOR_OF_FIZZ_BUZZ == 0;
    }

    @Override
    public String getResult() {
        return FIZZ_BUZZ;
    }
}
