package com.thoughtworks.btu;


import com.thoughtworks.btu.rule.Rule;

public class Student {

    private final Integer location;
    private String answer;

    public Student(Integer location) {
        this.location = location;
        this.answer = String.valueOf(location);
    }

    public boolean isConformBy(Rule rule) {
        if (rule.isApplicable(location)) {
            this.answer = rule.getResult();
            return true;
        }
        return false;
    }

    public String say() {
        return answer;
    }
}

