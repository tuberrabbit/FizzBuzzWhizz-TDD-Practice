package com.thoughtworks.btu;

public class WhizzRule implements Rule {
    public static final String WHIZZ = "Whizz";
    public static final int DIVISOR_OF_WHIZZ = 7;

    public WhizzRule() {
    }

    @Override
    public boolean isApplicable(Integer number) {
        return number % DIVISOR_OF_WHIZZ == 0;
    }

    @Override
    public String getResult() {
        return WHIZZ;
    }
}
