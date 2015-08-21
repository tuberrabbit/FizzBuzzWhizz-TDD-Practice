package com.thoughtworks.btu.rule;

public class FizzDigitalRule implements Rule {
    public static final String FIZZ = "Fizz";
    private static final Integer DIGITAL_OF_FIZZ = 3;

    @Override
    public boolean isApplicable(Integer number) {
        return String.valueOf(number).contains(String.valueOf(DIGITAL_OF_FIZZ));
    }

    @Override
    public String getResult() {
        return FIZZ;
    }
}
