package com.thoughtworks.btu.rule;

public class FizzRule implements Rule {
    public static final String FIZZ = "Fizz";
    private Integer divisorOfFizz;

    public FizzRule(Integer fizzNumber) {
        divisorOfFizz = fizzNumber;
    }

    @Override
    public boolean isApplicable(Integer number) {
        return number % divisorOfFizz == 0;
    }

    @Override
    public String getResult() {
        return FIZZ;
    }
}
