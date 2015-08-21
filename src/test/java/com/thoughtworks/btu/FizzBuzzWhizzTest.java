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
    public void should_return_Fizz_if_number_comform_the_FizzRule() {
        Integer number = FizzRule.DIVISOR_OF_FIZZ;
        assertThat(fizzBuzzWhizz.answer(number)).isEqualTo(FizzRule.FIZZ);

        number = FizzRule.DIVISOR_OF_FIZZ * 2;
        assertThat(fizzBuzzWhizz.answer(number)).isEqualTo(FizzRule.FIZZ);
    }

    @Test
    public void should_return_Buzz_if_number_comform_the_BuzzRule() {
        Integer number = BuzzRule.DIVISOR_OF_BUZZ;
        assertThat(fizzBuzzWhizz.answer(number)).isEqualTo(BuzzRule.BUZZ);

        number = BuzzRule.DIVISOR_OF_BUZZ * 2;
        assertThat(fizzBuzzWhizz.answer(number)).isEqualTo(BuzzRule.BUZZ);
    }

    @Test
    public void should_return_Whizz_if_number_comform_the_WhizzRule() {
        Integer number = WhizzRule.DIVISOR_OF_WHIZZ;
        assertThat(fizzBuzzWhizz.answer(number)).isEqualTo(WhizzRule.WHIZZ);

        number = WhizzRule.DIVISOR_OF_WHIZZ * 2;
        assertThat(fizzBuzzWhizz.answer(number)).isEqualTo(WhizzRule.WHIZZ);

    }

    @Test
    public void should_return_origin_number_if_number_no_comform_Rule() {
        assertThat(fizzBuzzWhizz.answer(2)).isEqualTo("2");

    }
}
