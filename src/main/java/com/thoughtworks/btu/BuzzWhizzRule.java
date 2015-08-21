package com.thoughtworks.btu;

public class BuzzWhizzRule implements Rule {
    public static final String BUZZ_WHIZZ = "BuzzWhizz";
    private static final Integer DIVISOR_OF_BUZZ_WHIZZ = 35;

    @Override
    public boolean isApplicable(Integer number) {
        return number % DIVISOR_OF_BUZZ_WHIZZ == 0;
    }

    @Override
    public String getResult() {
        return BUZZ_WHIZZ;
    }
}
