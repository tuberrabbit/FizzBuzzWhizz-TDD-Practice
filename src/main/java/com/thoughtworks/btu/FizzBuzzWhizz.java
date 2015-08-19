package com.thoughtworks.btu;

import java.util.Arrays;
import java.util.List;

public class FizzBuzzWhizz {


    private final List<Rule> rules = Arrays.asList(new FizzRule(), new BuzzRule(), new WhizzRule());

    public String answer(Integer number) {
        for (Rule rule : rules) {
            if (rule.isApplicable(number)) {
                return rule.getResult();
            }
        }
        return String.valueOf(number);
    }

}

