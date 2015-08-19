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
}
