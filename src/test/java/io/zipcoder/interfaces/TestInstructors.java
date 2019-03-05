package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

public class TestInstructors {
    @Test
    public void testInstructors() {
        //Given
        Instructors instructors = Instructors.getInstance();
        int expected = 7;
        //When
        int actual = instructors.getCount();
        //Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testInstructors2() {
        //Given
        String[] names = new String[]{"Kris", "Leon",
                "Dolio", "Froilan", "Nhu", "Melanie", "Wilhem"};
        Instructors instructors = Instructors.getInstance();
        //When
        boolean actual = instructors.containsAll(names);
        //Then
        Assert.assertTrue(actual);
    }
}
