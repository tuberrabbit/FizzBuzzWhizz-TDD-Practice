package com.thoughtworks.btu;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class TeacherTest {
    @Test
    public void should_return_true_if_teacher_say_three_special_number_success() {
        Teacher teacher = new Teacher();
        teacher.say(3, 5, 7);
        assertThat(teacher.getFizzNumber()).isEqualTo(3);
        assertThat(teacher.getBuzzNumber()).isEqualTo(5);
        assertThat(teacher.getWhizzNumber()).isEqualTo(7);
    }
}
