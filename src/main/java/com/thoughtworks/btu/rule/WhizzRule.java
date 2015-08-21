package com.thoughtworks.btu.rule;

public class WhizzRule implements Rule {
    public static final String WHIZZ = "Whizz";
    private int divisorOfWhizz = 7;

    public WhizzRule(Integer whizzNumber) {
        divisorOfWhizz = whizzNumber;
    }

    @Override
    public boolean isApplicable(Integer number) {
        return number % divisorOfWhizz == 0;
    }

    @Override
    public String getResult() {
        return WHIZZ;
    }
}
