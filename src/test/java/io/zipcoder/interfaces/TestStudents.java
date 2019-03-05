package io.zipcoder.interfaces;

import io.zipcoder.interfaces.Student;
import io.zipcoder.interfaces.Students;
import org.junit.Assert;
import org.junit.Test;

public class TestStudents {
    @Test
    public void testStudents() {
        //Given
        Students students = Students.getInstance();
        int expected = 43;
        //When
        int actual = students.getCount();
        //Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testStudents2() {
        //Given
         String[] names = new String[]{"Arcelia", "Ajah",
                "Alex", "Ashley B.", "Ashley S.", "Aswathy", "Brian",
                "Cara", "Charles", "Cristina", "David", "Davis", "Delenda",
                "Eleonor", "Eric", "Francisco", "Jim", "Joseph", "Julian",
                "Jutta", "Kat", "Kate", "Kyle", "Laxmi", "Leah", "Mark", "Marlys",
                "Marshilla", "Michael", "Neela", "Nirmala", "Reese",
                "Robyn", "Sean Green", "Sean Grey", "Shuchi", "Sravani",
                "Sunhyun", "Swampna", "Swathi", "William", "Yang", "Zaina"};
        Students students = Students.getInstance();
        //When
        boolean actual = students.containsAll(names);
        //Then
        Assert.assertTrue(actual);
    }
}
