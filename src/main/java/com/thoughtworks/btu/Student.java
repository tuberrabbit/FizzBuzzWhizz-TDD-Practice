package com.thoughtworks.btu;


import com.thoughtworks.btu.rule.Rule;

public class Student {

    public String answer(Integer number) {
        for (Rule rule : Teacher.RULES) {
            if (rule.isApplicable(number)) {
                return rule.getResult();
            }
        }
        return null;
    }

}

