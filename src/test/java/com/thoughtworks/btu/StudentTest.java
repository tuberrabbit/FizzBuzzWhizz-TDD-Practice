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
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class StudentTest {

    private List<Rule> rules;

    @Before
    public void setUp() {
        rules = new ArrayList<>();
        rules.add(new FizzDigitalRule(3));
        rules.add(new FizzBuzzWhizzRule(3, 5, 7));
        rules.add(new FizzBuzzRule(3, 5));
        rules.add(new FizzWhizzRule(3, 7));
        rules.add(new BuzzWhizzRule(5, 7));
        rules.add(new FizzRule(3));
        rules.add(new BuzzRule(5));
        rules.add(new WhizzRule(7));

    }

    @Test
    public void should_return_Fizz_if_the_student_conform_FizzRule() {
        Student student = new Student(6, rules);
        assertThat(student.answer()).isEqualTo("Fizz");

    }

    @Test
    public void should_return_Buzz_if_the_student_conform_BuzzRule() {
        Student student = new Student(5, rules);
        assertThat(student.answer()).isEqualTo("Buzz");

    }

    @Test
    public void should_return_Whizz_if_the_student_conform_WhizzRule() {
        Student student = new Student(7, rules);
        assertThat(student.answer()).isEqualTo("Whizz");

    }

    @Test
    public void should_return_FizzBuzz_if_the_student_conform_FizzBuzzRule() {
        Student student = new Student(15, rules);
        assertThat(student.answer()).isEqualTo("FizzBuzz");

    }

    @Test
    public void should_return_FizzWhizz_if_the_student_conform_FizzWhizzRule() {
        Student student = new Student(21, rules);
        assertThat(student.answer()).isEqualTo("FizzWhizz");

    }

    @Test
    public void should_return_BuzzWhizz_if_the_student_conform_BuzzWhizzRule() {
        Student student = new Student(70, rules);
        assertThat(student.answer()).isEqualTo("BuzzWhizz");

    }

    @Test
    public void should_return_FizzBuzzWhizz_if_the_student_conform_FizzBuzzWhizzRule() {
        Student student = new Student(105, rules);
        assertThat(student.answer()).isEqualTo("FizzBuzzWhizz");

    }

    @Test
    public void should_return_Fizz_if_the_student_conform_FizzDigitalRule() {
        Student student = new Student(35, rules);
        assertThat(student.answer()).isEqualTo("Fizz");

    }

    @Test
    public void should_return_origin_number_if_the_student_not_conform_any_Rule() {
        Student student = new Student(1, rules);
        assertThat(student.answer()).isEqualTo("1");

    }
}
