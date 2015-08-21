package com.thoughtworks.btu.rule;

public class FizzBuzzWhizzRule implements Rule {
    public static final String FIZZ_BUZZ_WHIZZ = "FizzBuzzWhizz";
    private Integer divisorOfFizzBuzzWhizz;

    public FizzBuzzWhizzRule(Integer fizzNumber, Integer buzzNumber, Integer whizzNumber) {
        divisorOfFizzBuzzWhizz = fizzNumber * buzzNumber * whizzNumber;
    }

    @Override
    public boolean isApplicable(Integer number) {
        return number % divisorOfFizzBuzzWhizz == 0;
    }

    @Override
    public String getResult() {
        return FIZZ_BUZZ_WHIZZ;
    }
}
