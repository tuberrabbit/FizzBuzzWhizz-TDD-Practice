package com.thoughtworks.btu;


import com.thoughtworks.btu.rule.Rule;

public class Student {

    private final Integer location;

    public Student(Integer location) {
        this.location = location;
    }

    public String answer(Rule rule) {
        if (rule.isApplicable(location)) {
            return rule.getResult();
        }
        return String.valueOf(location);
    }

}

