package com.thoughtworks.btu;

public class NomalRule implements Rule {
    private Integer number;

    @Override
    public boolean isApplicable(Integer number) {
        this.number = number;
        return true;
    }

    @Override
    public String getResult() {
        return String.valueOf(number);
    }
}
