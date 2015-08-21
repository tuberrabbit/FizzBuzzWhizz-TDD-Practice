package com.thoughtworks.btu;

import com.thoughtworks.btu.rule.BuzzRule;
import com.thoughtworks.btu.rule.BuzzWhizzRule;
import com.thoughtworks.btu.rule.FizzBuzzRule;
import com.thoughtworks.btu.rule.FizzBuzzWhizzRule;
import com.thoughtworks.btu.rule.FizzDigitalRule;
import com.thoughtworks.btu.rule.FizzRule;
import com.thoughtworks.btu.rule.FizzWhizzRule;
import com.thoughtworks.btu.rule.Rule;
import com.thoughtworks.btu.rule.WhizzRule;

import java.util.ArrayList;
import java.util.List;

public class Teacher {
    private static List<Rule> rules;
    public static void build(Integer fizzNumber, Integer buzzNumber, Integer whizzNumber) {
        rules = new ArrayList<>();
        rules.add(new FizzDigitalRule(fizzNumber));
        rules.add(new FizzBuzzWhizzRule(fizzNumber, buzzNumber, whizzNumber));
        rules.add(new FizzBuzzRule(fizzNumber, buzzNumber));
        rules.add(new FizzWhizzRule(fizzNumber, whizzNumber));
        rules.add(new BuzzWhizzRule(buzzNumber, whizzNumber));
        rules.add(new FizzRule(fizzNumber));
        rules.add(new BuzzRule(buzzNumber));
        rules.add(new WhizzRule(whizzNumber));
    }

    public static List<Rule> getRules() {
        return rules;
    }
}
