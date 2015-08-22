package com.thoughtworks.btu;

import com.thoughtworks.btu.rule.BuzzRule;
import com.thoughtworks.btu.rule.BuzzWhizzRule;
import com.thoughtworks.btu.rule.FizzBuzzRule;
import com.thoughtworks.btu.rule.FizzBuzzWhizzRule;
import com.thoughtworks.btu.rule.FizzDigitalRule;
import com.thoughtworks.btu.rule.FizzRule;
import com.thoughtworks.btu.rule.FizzWhizzRule;
import com.thoughtworks.btu.rule.NomalRule;
import com.thoughtworks.btu.rule.Rule;
import com.thoughtworks.btu.rule.WhizzRule;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class StudentTest {
    @Test
    public void should_return_Fizz_if_the_student_conform_FizzRule() {
        Student student = new Student(3);
        Rule rule = new FizzRule(3);
        assertThat(student.isConformBy(rule)).isTrue();
        assertThat(student.say()).isEqualTo("Fizz");

    }

    @Test
    public void should_return_Buzz_if_the_student_conform_BuzzRule() {
        Student student = new Student(5);
        Rule rule = new BuzzRule(5);
        assertThat(student.isConformBy(rule)).isTrue();
        assertThat(student.say()).isEqualTo("Buzz");

    }

    @Test
    public void should_return_Whizz_if_the_student_conform_WhizzRule() {
        Student student = new Student(7);
        Rule rule = new WhizzRule(7);
        assertThat(student.isConformBy(rule)).isTrue();
        assertThat(student.say()).isEqualTo("Whizz");

    }

    @Test
    public void should_return_FizzBuzz_if_the_student_conform_FizzBuzzRule() {
        Student student = new Student(15);
        Rule rule = new FizzBuzzRule(3, 5);
        assertThat(student.isConformBy(rule)).isTrue();
        assertThat(student.say()).isEqualTo("FizzBuzz");

    }

    @Test
    public void should_return_FizzWhizz_if_the_student_conform_FizzWhizzRule() {
        Student student = new Student(21);
        Rule rule = new FizzWhizzRule(3, 7);
        assertThat(student.isConformBy(rule)).isTrue();
        assertThat(student.say()).isEqualTo("FizzWhizz");

    }

    @Test
    public void should_return_BuzzWhizz_if_the_student_conform_BuzzWhizzRule() {
        Student student = new Student(35);
        Rule rule = new BuzzWhizzRule(5, 7);
        assertThat(student.isConformBy(rule)).isTrue();
        assertThat(student.say()).isEqualTo("BuzzWhizz");

    }

    @Test
    public void should_return_FizzBuzzWhizz_if_the_student_conform_FizzBuzzWhizzRule() {
        Student student = new Student(105);
        Rule rule = new FizzBuzzWhizzRule(3, 5, 7);
        assertThat(student.isConformBy(rule)).isTrue();
        assertThat(student.say()).isEqualTo("FizzBuzzWhizz");

    }

    @Test
    public void should_return_Fizz_if_the_student_conform_FizzDigitalRule() {
        Student student = new Student(13);
        Rule rule = new FizzDigitalRule(3);
        assertThat(student.isConformBy(rule)).isTrue();
        assertThat(student.say()).isEqualTo("Fizz");

    }

    @Test
    public void should_return_origin_number_if_the_student_not_conform_any_Rule() {
        Student student = new Student(1);
        Rule rule = new NomalRule();
        assertThat(student.isConformBy(rule)).isTrue();
        assertThat(student.say()).isEqualTo("1");

    }
}
