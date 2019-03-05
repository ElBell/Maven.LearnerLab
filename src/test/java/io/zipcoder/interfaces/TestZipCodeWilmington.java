package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

public class TestZipCodeWilmington {
    @Test
    public void testHostLecture() {
        //Given
        ZipCodeWilmington zipCodeWilmington = ZipCodeWilmington.getInstance();
        int increase = 86;
        int startingTotal = zipCodeWilmington.getTotalHoursStudied();
        int expected = startingTotal + increase;

        //When
        zipCodeWilmington.hostLecture(1, increase);
        //Then
        int actual = zipCodeWilmington.getTotalHoursStudied();
        Assert.assertEquals(expected, actual);
    }
}
