package com.thoughtworks.btu;

import java.util.Arrays;
import java.util.List;

public class FizzBuzzWhizz {


    private final List<Rule> rules = Arrays.asList(new FizzDigitalRule(), new FizzBuzzWhizzRule(), new FizzBuzzRule(),
            new FizzWhizzRule(), new BuzzWhizzRule(), new FizzRule(), new BuzzRule(), new WhizzRule(), new NomalRule());

    public String answer(Integer number) {
        for (Rule rule : rules) {
            if (rule.isApplicable(number)) {
                return rule.getResult();
            }
        }
        return null;
    }

}

