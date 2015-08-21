package com.thoughtworks.btu;


import com.thoughtworks.btu.rule.Rule;

public class Student {

    private final Integer location;

    public Student(Integer location) {
        this.location = location;
    }

    public String answer(Rule rule) {
        return rule.isApplicable(location) ? rule.getResult() : "";
    }

}

