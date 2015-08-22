package com.thoughtworks.btu;

import com.thoughtworks.btu.rule.Rule;
import com.thoughtworks.btu.rule.RuleFactory;

import java.util.List;
import java.util.Scanner;

public class Launcher {

    public static final int COUNT = 100;

    public static void main(String[] asdf) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            Teacher teacher = new Teacher();
            teacher.say(scanner.nextInt(), scanner.nextInt(), scanner.nextInt());
            List<Rule> rules = RuleFactory.build(teacher);
            for (int i = 0; i < COUNT; ++i) {
                Integer location = i + 1;
                Student student = new Student(location);
                for (Rule rule : rules) {
                    if (student.isConformBy(rule)) {
                        System.out.println(student.say());
                        break;
                    }
                }
            }
        }
    }
}
