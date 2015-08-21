package com.thoughtworks.btu.rule;

public class BuzzWhizzRule implements Rule {
    public static final String BUZZ_WHIZZ = "BuzzWhizz";
    private Integer divisorOfBuzzWhizz;

    public BuzzWhizzRule(Integer buzzNumber, Integer whizzNumber) {
        divisorOfBuzzWhizz = buzzNumber * whizzNumber;
    }

    @Override
    public boolean isApplicable(Integer number) {
        return number % divisorOfBuzzWhizz == 0;
    }

    @Override
    public String getResult() {
        return BUZZ_WHIZZ;
    }
}
