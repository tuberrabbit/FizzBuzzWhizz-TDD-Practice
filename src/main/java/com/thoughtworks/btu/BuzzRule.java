package com.thoughtworks.btu;

public class BuzzRule implements Rule {
    public static final String BUZZ = "Buzz";
    private static final int DIVISOR_OF_BUZZ = 5;

    @Override
    public boolean isApplicable(Integer number) {
        return number % DIVISOR_OF_BUZZ == 0;
    }

    @Override
    public String getResult() {
        return BUZZ;
    }
}
