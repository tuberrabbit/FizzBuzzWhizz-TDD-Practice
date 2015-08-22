package com.thoughtworks.btu.rule;

import com.thoughtworks.btu.Teacher;

import java.util.ArrayList;
import java.util.List;

public class RuleFactory {
    public static List<Rule> build(Teacher teacher) {
        Integer fizzNumber = teacher.getFizzNumber();
        Integer buzzNumber = teacher.getBuzzNumber();
        Integer whizzNumber = teacher.getWhizzNumber();
        List<Rule> rules = new ArrayList<>();

        rules.add(new FizzDigitalRule(fizzNumber));
        rules.add(new FizzBuzzWhizzRule(fizzNumber, buzzNumber, whizzNumber));
        rules.add(new FizzBuzzRule(fizzNumber, buzzNumber));
        rules.add(new FizzWhizzRule(fizzNumber, whizzNumber));
        rules.add(new BuzzWhizzRule(buzzNumber, whizzNumber));
        rules.add(new FizzRule(fizzNumber));
        rules.add(new BuzzRule(buzzNumber));
        rules.add(new WhizzRule(whizzNumber));
        rules.add(new NomalRule());

        return rules;
    }
}
