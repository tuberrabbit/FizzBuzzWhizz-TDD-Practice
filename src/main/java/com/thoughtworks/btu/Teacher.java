package com.thoughtworks.btu;

public class Teacher {
    private Integer fizzNumber;
    private Integer buzzNumber;
    private Integer whizzNumber;

    public Integer getFizzNumber() {
        return fizzNumber;
    }

    public Integer getBuzzNumber() {
        return buzzNumber;
    }

    public Integer getWhizzNumber() {
        return whizzNumber;
    }

    public void say(Integer fizzNumber, Integer buzzNumber, Integer whizzNumber) {
        this.fizzNumber = fizzNumber;
        this.buzzNumber = buzzNumber;
        this.whizzNumber = whizzNumber;
    }
}
