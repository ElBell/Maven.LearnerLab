package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

public class TestPeople {
    @Test
    public void testAdd() {
        //Given
        People people = new People();
        Person person1 = new Person(0);
        Person person2 = new Person(1);
        Person[] expected = new Person[]{person1, person2};

        //When
        people.add(person1);
        people.add(person2);

        //Then
        Person[] actual = people.getArray();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testRemove() {
        //Given
        People people = new People();
        Person person1 = new Person(0);
        Person person2 = new Person(1);
        Person person3 = new Person(333);
        people.add(person1);
        people.add(person2);
        people.add(person3);
        Person[] expected = new Person[]{person1, person3};

        //When
        people.remove(person2);

        //Then
        Person[] actual = people.getArray();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testFindByID() {
        //Given
        People people = new People();
        Person person1 = new Person(0);
        Person person2 = new Person(1);
        Person person3 = new Person(333);
        people.add(person1);
        people.add(person2);
        people.add(person3);
        Person expected = person3;

        //When
        Person actual = people.findById(333);

        //Then
        Assert.assertEquals(expected, actual);
    }


}
