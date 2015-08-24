package com.thoughtworks.btu.rule;

import com.thoughtworks.btu.Teacher;
import org.junit.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class RuleFactoryTest {
    @Test
    public void should_return_rules_based_on_what_teacher_said() {
        Teacher teacher = new Teacher();
        teacher.say(3, 5, 7);
        List<Rule> rules = RuleFactory.build(teacher);

        assertThat(rules).isNotNull();
        assertThat(rules.size()).isGreaterThan(0);

    }
}
