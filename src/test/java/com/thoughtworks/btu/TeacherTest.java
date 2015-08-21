package com.thoughtworks.btu;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class TeacherTest {
    @Test
    public void should_generate_rules_if_teacher_has_the_three_special_number() {
        Teacher.build(3, 5, 7);
        assertThat(Teacher.getRules()).isNotNull();
    }
}
