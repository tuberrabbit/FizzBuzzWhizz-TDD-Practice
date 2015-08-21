package com.thoughtworks.btu.rule;

public class FizzBuzzWhizzRule implements Rule {
    public static final String FIZZ_BUZZ_WHIZZ = "FizzBuzzWhizz";
    private static final Integer DIVISOR_OF_FIZZ_BUZZ_WHIZZ = 105;

    @Override
    public boolean isApplicable(Integer number) {
        return number % DIVISOR_OF_FIZZ_BUZZ_WHIZZ == 0;
    }

    @Override
    public String getResult() {
        return FIZZ_BUZZ_WHIZZ;
    }
}
