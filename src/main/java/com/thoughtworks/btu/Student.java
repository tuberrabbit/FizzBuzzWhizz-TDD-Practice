package com.thoughtworks.btu;


import com.thoughtworks.btu.rule.Rule;

public class Student {

    public String answer(Integer number) {
        for (Rule rule : Teacher.getRules()) {
            if (rule.isApplicable(number)) {
                return rule.getResult();
            }
        }
        return String.valueOf(number);
    }

}

