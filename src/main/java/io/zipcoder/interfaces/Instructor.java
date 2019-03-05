package io.zipcoder.interfaces;

import java.util.Arrays;

public class Instructor extends Person implements Teacher {
    public Instructor(long id) {
        super(id);
    }
    public Instructor(long id, String name) {
        super(id, name);
    }

    public void teach(Learner learner, double numberOfHours) {
        learner.learn(numberOfHours);
    }

    public void lecture(Learner[] learners, double numberOfHours) {
        Arrays.stream(learners)
                .forEach(learner -> learner.learn(numberOfHours/learners.length));
    }

    
}
