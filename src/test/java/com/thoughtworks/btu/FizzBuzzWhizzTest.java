package com.thoughtworks.btu;

import org.junit.Before;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class FizzBuzzWhizzTest {

    private FizzBuzzWhizz fizzBuzzWhizz;

    @Before
    public void setUp() {
        this.fizzBuzzWhizz = new FizzBuzzWhizz();
    }

    @Test
    public void should_return_Fizz_if_number_is_times_of_first_special_number() {
        // given
        Integer three = 3;
        Integer nine = 9;

        // when

        // then
        assertThat(fizzBuzzWhizz.answer(three)).isEqualTo("Fizz");
        assertThat(fizzBuzzWhizz.answer(nine)).isEqualTo("Fizz");
    }

    @Test
    public void should_return_the_same_number_if_number_is_not_the_times_of_first_special_number() {
        //given
        Integer number = 4;

        //when

        //then
        assertThat(fizzBuzzWhizz.answer(number)).isEqualTo(String.valueOf(number));
    }

    @Test
    public void should_return_Buzz_if_number_is_times_of_the_second_special_number() {
        //given
        Integer five = 5;
        Integer ten = 10;

        //when

        //then
        assertThat(fizzBuzzWhizz.answer(five)).isEqualTo("Buzz");
        assertThat(fizzBuzzWhizz.answer(ten)).isEqualTo("Buzz");
    }

    @Test
    public void should_return_the_same_number_if_number_is_not_the_times_of_the_second_special_number() {
        //given
        Integer two = 2;

        //when

        //then
        assertThat(fizzBuzzWhizz.answer(two)).isEqualTo(String.valueOf(two));
    }

    @Test
    public void should_return_Whizz_if_number_is_times_of_the_third_special_number() {
        //given
        Integer seven = 7;
        Integer fourteen = 14;

        //when

        //then
        assertThat(fizzBuzzWhizz.answer(seven)).isEqualTo("Whizz");
        assertThat(fizzBuzzWhizz.answer(fourteen)).isEqualTo("Whizz");
    }

    @Test
    public void should_return_the_same_number_if_number_is_not_the_times_of_the_third_special_number() {
        Integer eight = 8;
        assertThat(fizzBuzzWhizz.answer(eight)).isEqualTo(String.valueOf(eight));
    }
}
