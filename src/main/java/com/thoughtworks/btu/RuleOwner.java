package com.thoughtworks.btu;

import com.thoughtworks.btu.rule.FizzDigitalRule;
import com.thoughtworks.btu.rule.FizzRule;
import com.thoughtworks.btu.rule.FizzWhizzRule;
import com.thoughtworks.btu.rule.Rule;
import com.thoughtworks.btu.rule.FizzBuzzWhizzRule;
import com.thoughtworks.btu.rule.FizzBuzzRule;
import com.thoughtworks.btu.rule.BuzzWhizzRule;
import com.thoughtworks.btu.rule.BuzzRule;
import com.thoughtworks.btu.rule.WhizzRule;
import com.thoughtworks.btu.rule.NomalRule;

import java.util.Arrays;
import java.util.List;

public final class RuleOwner {
    public static final List<Rule> RULES = Arrays.asList(new FizzDigitalRule(), new FizzBuzzWhizzRule(), new FizzBuzzRule(),
            new FizzWhizzRule(), new BuzzWhizzRule(), new FizzRule(), new BuzzRule(), new WhizzRule(), new NomalRule());

    private RuleOwner() {
    }

}
