package com.thoughtworks.btu.rule;

public class FizzDigitalRule implements Rule {
    public static final String FIZZ = "Fizz";
    private Integer digitalOfFizz;

    public FizzDigitalRule(Integer fizzNumber) {
        digitalOfFizz = fizzNumber;
    }

    @Override
    public boolean isApplicable(Integer number) {
        return String.valueOf(number).contains(String.valueOf(digitalOfFizz));
    }

    @Override
    public String getResult() {
        return FIZZ;
    }
}
