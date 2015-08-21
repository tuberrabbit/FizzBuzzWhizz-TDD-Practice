package com.thoughtworks.btu.rule;

public class FizzBuzzRule implements Rule {
    public static final String FIZZ_BUZZ = "FizzBuzz";
    private Integer divisorOfFizzBuzz;

    public FizzBuzzRule(Integer fizzNumber, Integer buzzNumber) {
        divisorOfFizzBuzz = fizzNumber * buzzNumber;
    }

    @Override
    public boolean isApplicable(Integer number) {
        return number % divisorOfFizzBuzz == 0;
    }

    @Override
    public String getResult() {
        return FIZZ_BUZZ;
    }
}
