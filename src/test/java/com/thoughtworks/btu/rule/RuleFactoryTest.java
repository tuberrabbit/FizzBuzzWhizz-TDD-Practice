package com.thoughtworks.btu.rule;

import com.thoughtworks.btu.Teacher;
import org.junit.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class RuleFactoryTest {
    @Test
    public void should_return_rules_based_on_what_teacher_said() {
        Teacher teacher = mock(Teacher.class);
        when(teacher.getFizzNumber()).thenReturn(3);
        when(teacher.getBuzzNumber()).thenReturn(5);
        when(teacher.getWhizzNumber()).thenReturn(7);
        List<Rule> rules = RuleFactory.build(teacher);
        assertThat(rules).isNotNull();
        assertThat(rules.size()).isGreaterThan(0);

    }
}
