package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

public class TestEducator {
    @Test
    public void testImplementation() {
        //Given
        Educator educator = Educator.KRIS;
        //Then
        Assert.assertTrue(educator instanceof Teacher);
    }

    @Test
    public void testInheritance() {
        //Given
        Educator educator = Educator.LEON;
        Person person = educator.getInstructor();
        //Then
        Assert.assertTrue(person instanceof Person);
    }

    @Test
    public void testTeach() {
        //Given
        Educator educator = Educator.NHU;
        double increase = 10L;
        Student student = new Student(0);
        double expected = student.getTotalStudyTime() + increase;
        double expectedHoursWorked = educator.getTimeWorked() + increase;
        //When
        educator.teach(student, increase);
        //Then
        double actual = student.getTotalStudyTime();
        double actualHoursWorked = educator.getTimeWorked();
        Assert.assertEquals(expected, actual, 0.1);
        Assert.assertEquals(expectedHoursWorked, actualHoursWorked, 0.01);
    }

    @Test
    public void testLecture() {
        //Given
        Educator educator = Educator.DOLIO;
        double increase = 10L;
        Student student = new Student(0);
        Student student1 = new Student(70L);
        double expected = student.getTotalStudyTime() + increase/2;
        double expected1 = student1.getTotalStudyTime() + increase/2;
        Student[] students = {student, student1};
        double expectedHoursWorked = educator.getTimeWorked() + increase;
        //When
        educator.lecture(students, increase);
        //Then
        double actual = student.getTotalStudyTime();
        double actual1 = student1.getTotalStudyTime();
        double actualHoursWorked = educator.getTimeWorked();
        Assert.assertEquals(expected, actual, 0.1);
        Assert.assertEquals(expected1, actual1, 0.1);
        Assert.assertEquals(expectedHoursWorked, actualHoursWorked, 0.01);
    }

    @Test
    public void testLecture2() {
        //Given
        Educator educator = Educator.FROILAN;
        double increase = 10L;
        Student student = new Student(0);
        Student student1 = new Student(70L);
        Student student2 = new Student(70L);
        double expected = student.getTotalStudyTime() + increase / 3;
        double expected1 = student1.getTotalStudyTime() + increase / 3;
        double expectedHoursWorked = educator.getTimeWorked() + increase;
        Student[] students = {student, student1, student2};
        //When
        educator.lecture(students, increase);
        //Then
        double actual = student.getTotalStudyTime();
        double actual1 = student1.getTotalStudyTime();
        double actualHoursWorked = educator.getTimeWorked();
        Assert.assertEquals(expected, actual, 0.1);
        Assert.assertEquals(expected1, actual1, 0.1);
        Assert.assertEquals(expectedHoursWorked, actualHoursWorked, 0.01);
    }
}
