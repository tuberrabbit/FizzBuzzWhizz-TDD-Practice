package com.thoughtworks.btu.rule;

public class WhizzRule implements Rule {
    public static final String WHIZZ = "Whizz";
    private static final int DIVISOR_OF_WHIZZ = 7;

    @Override
    public boolean isApplicable(Integer number) {
        return number % DIVISOR_OF_WHIZZ == 0;
    }

    @Override
    public String getResult() {
        return WHIZZ;
    }
}
