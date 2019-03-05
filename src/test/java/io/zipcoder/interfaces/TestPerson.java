package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

public class TestPerson {

    @Test
    public void testConstructor() {
        //Given
        long expected = 50L;
        //When
        Person testPerson = new Person(expected);
        //Then
        long actual = testPerson.getId();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testSetName() {
        //Given
        String expected = "Ada";
        Person testPerson = new Person(0);
        //When
        testPerson.setName(expected);
        //Then
        String actual = testPerson.getName();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testSetNameNull() {
        //Given
        String expected = null;
        Person testPerson = new Person(0);
        //When
        testPerson.setName(expected);
        //Then
        String actual = testPerson.getName();
        Assert.assertEquals(expected, actual);
    }
}
