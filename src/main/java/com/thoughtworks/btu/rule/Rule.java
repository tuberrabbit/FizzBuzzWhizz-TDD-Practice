package com.thoughtworks.btu.rule;

public interface Rule {
    boolean isApplicable(Integer number);

    String getResult();
}
