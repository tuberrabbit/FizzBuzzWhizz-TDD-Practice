package com.thoughtworks.btu;


import com.thoughtworks.btu.rule.Rule;

import java.util.List;

public class Student {

    private final Integer location;

    public Student(Integer location) {
        this.location = location;
    }

    public String say(List<Rule> rules) {
        for (Rule rule : rules) {
            if (rule.isApplicable(location)) {
                return rule.getResult();
            }
        }
        return String.valueOf(location);
    }
}

