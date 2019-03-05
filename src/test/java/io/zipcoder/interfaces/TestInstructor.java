package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

public class TestInstructor {
    @Test
    public void testImplementation() {
        //Given
        Instructor instructor = new Instructor(0);
        //Then
        Assert.assertTrue(instructor instanceof Teacher);
    }

    @Test
    public void testInheritance() {
        //Given
        Instructor instructor = new Instructor(0);
        //Then
        Assert.assertTrue(instructor instanceof Person);
    }

    @Test
    public void testTeach() {
        //Given
        Instructor instructor = new Instructor(0);
        double increase = 10L;
        Student student = new Student(0);
        double expected = student.getTotalStudyTime() + increase;
        //When
        instructor.teach(student, increase);
        //Then
        double actual = student.getTotalStudyTime();
        Assert.assertEquals(expected, actual, 0.1);
    }

    @Test
    public void testLecture() {
        //Given
        Instructor instructor = new Instructor(0);
        double increase = 10L;
        Student student = new Student(0);
        Student student1 = new Student(70L);
        double expected = student.getTotalStudyTime() + increase/2;
        double expected1 = student1.getTotalStudyTime() + increase/2;
        Student[] students = {student, student1};
        //When
        instructor.lecture(students, increase);
        //Then
        double actual = student.getTotalStudyTime();
        double actual1 = student1.getTotalStudyTime();
        Assert.assertEquals(expected, actual, 0.1);
        Assert.assertEquals(expected1, actual1, 0.1);
    }

    @Test
    public void testLecture2() {
        //Given
        Instructor instructor = new Instructor(0);
        double increase = 10L;
        Student student = new Student(0);
        Student student1 = new Student(70L);
        Student student2 = new Student(70L);
        double expected = student.getTotalStudyTime() + increase / 3;
        double expected1 = student1.getTotalStudyTime() + increase / 3;
        Student[] students = {student, student1, student2};
        //When
        instructor.lecture(students, increase);
        //Then
        double actual = student.getTotalStudyTime();
        double actual1 = student1.getTotalStudyTime();
        Assert.assertEquals(expected, actual, 0.1);
        Assert.assertEquals(expected1, actual1, 0.1);
    }
}
