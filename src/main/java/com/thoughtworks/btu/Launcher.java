package com.thoughtworks.btu;

import com.thoughtworks.btu.rule.Rule;
import com.thoughtworks.btu.rule.RuleFactory;

import java.util.List;
import java.util.Scanner;

public class Launcher {

    public static final int COUNT_OF_STUDENTS = 100;
    private static Teacher teacher;

    public static void main(String[] asdf) {
        initDate();
        iterateStudentToCountOff(RuleFactory.build(teacher));
    }

    private static void initDate() {
        Scanner scanner = new Scanner(System.in);
        teacher = new Teacher();
        teacher.say(scanner.nextInt(), scanner.nextInt(), scanner.nextInt());
    }

    private static void iterateStudentToCountOff(List<Rule> rules) {
        for (int i = 0; i < COUNT_OF_STUDENTS; ++i) {
            Student student = new Student(i + 1);
            System.out.println(student.say(rules));
        }
    }

}
