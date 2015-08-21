package com.thoughtworks.btu.rule;

public class BuzzRule implements Rule {
    public static final String BUZZ = "Buzz";
    private Integer divisorOfBuzz = 5;

    public BuzzRule(Integer buzzNumber) {
        divisorOfBuzz = buzzNumber;
    }

    @Override
    public boolean isApplicable(Integer number) {
        return number % divisorOfBuzz == 0;
    }

    @Override
    public String getResult() {
        return BUZZ;
    }
}
