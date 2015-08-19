package com.thoughtworks.btu;

public interface Rule {
    boolean isApplicable(Integer number);

    String getResult();
}
