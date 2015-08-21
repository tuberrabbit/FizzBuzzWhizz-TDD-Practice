package com.thoughtworks.btu;

import com.thoughtworks.btu.rule.FizzBuzzRule;
import com.thoughtworks.btu.rule.FizzBuzzWhizzRule;
import com.thoughtworks.btu.rule.FizzDigitalRule;
import com.thoughtworks.btu.rule.FizzWhizzRule;
import com.thoughtworks.btu.rule.BuzzWhizzRule;
import com.thoughtworks.btu.rule.FizzRule;
import com.thoughtworks.btu.rule.BuzzRule;
import com.thoughtworks.btu.rule.WhizzRule;

import org.junit.Before;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class StudentTest {

    private Student student;

    @Before
    public void setUp() {
        this.student = new Student();
        Teacher.build(3, 5, 7);
    }

    @Test
    public void should_return_Fizz_if_number_comform_the_FizzRule() {
        assertThat(student.answer(3)).isEqualTo(FizzRule.FIZZ);

        assertThat(student.answer(6)).isEqualTo(FizzRule.FIZZ);
    }

    @Test
    public void should_return_Buzz_if_number_comform_the_BuzzRule() {
        assertThat(student.answer(5)).isEqualTo(BuzzRule.BUZZ);

        assertThat(student.answer(10)).isEqualTo(BuzzRule.BUZZ);
    }

    @Test
    public void should_return_Whizz_if_number_comform_the_WhizzRule() {
        assertThat(student.answer(7)).isEqualTo(WhizzRule.WHIZZ);

        assertThat(student.answer(14)).isEqualTo(WhizzRule.WHIZZ);

    }

    @Test
    public void should_return_origin_number_if_number_comform_the_NomalRule() {
        assertThat(student.answer(1)).isEqualTo(String.valueOf((Integer) 1));

    }

    @Test
    public void should_return_FizzBuzz_if_number_comform_the_FizzBuzzRule() {
        assertThat(student.answer(15)).isEqualTo(FizzBuzzRule.FIZZ_BUZZ);

    }

    @Test
    public void should_return_FizzWhizz_if_number_comform_the_FizzWhizzRule() {
        assertThat(student.answer(21)).isEqualTo(FizzWhizzRule.FIZZ_WHIZZ);

    }

    @Test
    public void should_return_BuzzWhizz_if_number_comform_the_BuzzWhizzRule() {
        assertThat(student.answer(70)).isEqualTo(BuzzWhizzRule.BUZZ_WHIZZ);

    }

    @Test
    public void should_return_FizzBuzzWhizz_if_number_comform_the_FizzBuzzWhizzRule() {
        assertThat(student.answer(105)).isEqualTo(FizzBuzzWhizzRule.FIZZ_BUZZ_WHIZZ);

    }

    @Test
    public void should_return_Fizz_if_number_comform_the_FizzDigitalRule() {
        assertThat(student.answer(13)).isEqualTo(FizzDigitalRule.FIZZ);

    }
}
