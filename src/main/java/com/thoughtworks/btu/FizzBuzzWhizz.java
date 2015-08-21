package com.thoughtworks.btu;


import com.thoughtworks.btu.rule.Rule;

public class FizzBuzzWhizz {

    public String answer(Integer number) {
        for (Rule rule : RuleOwner.RULES) {
            if (rule.isApplicable(number)) {
                return rule.getResult();
            }
        }
        return null;
    }

}

