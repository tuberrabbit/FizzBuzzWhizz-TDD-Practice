package com.thoughtworks.btu.rule;

public class FizzWhizzRule implements Rule {
    public static final String FIZZ_WHIZZ = "FizzWhizz";
    private static final Integer DIVISOR_OF_FIZZ_WHIZZ = 21;

    @Override
    public boolean isApplicable(Integer number) {
        return number % DIVISOR_OF_FIZZ_WHIZZ == 0;
    }

    @Override
    public String getResult() {
        return FIZZ_WHIZZ;
    }
}
