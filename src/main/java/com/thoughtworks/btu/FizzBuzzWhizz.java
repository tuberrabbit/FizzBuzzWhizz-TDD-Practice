package com.thoughtworks.btu;

public class FizzBuzzWhizz {
    public String answer(Integer number) {
        if (number%3==0) {
            return "Fizz";
        }
        return String.valueOf(number);
    }
}
