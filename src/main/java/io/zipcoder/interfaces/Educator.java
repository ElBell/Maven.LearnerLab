package io.zipcoder.interfaces;

import java.util.Arrays;

public enum Educator implements Teacher{
    KRIS(new Instructor(0, "Kris")),
    LEON(new Instructor(1, "Leon")),
    NHU(new Instructor(2, "Nhu")),
    FROILAN(new Instructor(3, "Froilan")),
    DOLIO(new Instructor(4, "Dolio")),
    MELANIE(new Instructor(5, "Melanie")),
    WILHEM(new Instructor(6, "Wilhem"));

    private final Instructor instructor;
    private double timeWorked;
    Educator(Instructor instructor) {
        this.instructor = instructor;
    }

    public Instructor getInstructor() {
        return instructor;
    }

    public double getTimeWorked() {
        return timeWorked;
    }

    @Override
    public void teach(Learner learner, double numberOfHours) {
        this.timeWorked += numberOfHours;
        learner.learn(numberOfHours);
    }

    @Override
    public void lecture(Learner[] learners, double numberOfHours) {
        this.timeWorked += numberOfHours;
        Arrays.stream(learners)
                .forEach(learner -> learner.learn(numberOfHours/learners.length));
    }
}
