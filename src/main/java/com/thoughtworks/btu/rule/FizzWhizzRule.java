package com.thoughtworks.btu.rule;

public class FizzWhizzRule implements Rule {
    public static final String FIZZ_WHIZZ = "FizzWhizz";
    private Integer divisorOfFizzWhizz;

    public FizzWhizzRule(Integer fizzNumber, Integer whizzNumber) {
        divisorOfFizzWhizz = fizzNumber * whizzNumber;
    }

    @Override
    public boolean isApplicable(Integer number) {
        return number % divisorOfFizzWhizz == 0;
    }

    @Override
    public String getResult() {
        return FIZZ_WHIZZ;
    }
}
