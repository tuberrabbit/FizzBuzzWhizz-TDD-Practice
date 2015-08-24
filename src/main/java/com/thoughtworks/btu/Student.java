package com.thoughtworks.btu;


import com.thoughtworks.btu.rule.Rule;

import java.util.List;

public class Student {

    private final Integer location;
    private final List<Rule> rules;

    public Student(Integer location, List<Rule> rules) {
        this.location = location;
        this.rules = rules;
    }

    public String answer() {
        for (Rule rule : rules) {
            if (rule.isApplicable(location)) {
                return rule.getResult();
            }
        }
        return String.valueOf(location);
    }
}

