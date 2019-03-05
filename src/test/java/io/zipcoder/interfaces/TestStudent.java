package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

public class TestStudent {
    @Test
    public void testImplementation() {
        //Given
        Student student = new Student(0);
        //Then
        Assert.assertTrue(student instanceof Learner);
    }

    @Test
    public void testInheritance() {
        //Given
        Student student = new Student(0);
        //Then
        Assert.assertTrue(student instanceof Person);
    }

    @Test
    public void testLearn() {
        //Given
        double increase = 10L;
        Student student = new Student(0);
        double expected = student.getTotalStudyTime() + increase;
        //When
        student.learn(increase);
        //Then
        double actual = student.getTotalStudyTime();
        Assert.assertEquals(expected, actual, 0.1);
    }

    @Test
    public void testLearn2() {
        //Given
        double increase = 10000L;
        Student student = new Student(0);
        student.learn(500);
        double expected = student.getTotalStudyTime() + increase;
        //When
        student.learn(increase);
        //Then
        double actual = student.getTotalStudyTime();
        Assert.assertEquals(expected, actual, 0.1);
    }
}
