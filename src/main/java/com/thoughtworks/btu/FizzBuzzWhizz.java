package com.thoughtworks.btu;


import com.thoughtworks.btu.rule.FizzBuzzRule;
import com.thoughtworks.btu.rule.FizzBuzzWhizzRule;
import com.thoughtworks.btu.rule.FizzDigitalRule;
import com.thoughtworks.btu.rule.FizzWhizzRule;
import com.thoughtworks.btu.rule.BuzzWhizzRule;
import com.thoughtworks.btu.rule.FizzRule;
import com.thoughtworks.btu.rule.BuzzRule;
import com.thoughtworks.btu.rule.WhizzRule;
import com.thoughtworks.btu.rule.NomalRule;
import com.thoughtworks.btu.rule.Rule;

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

