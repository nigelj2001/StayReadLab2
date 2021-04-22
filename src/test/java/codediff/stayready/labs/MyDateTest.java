package codediff.stayready.labs;

import org.junit.Assert;
import org.junit.Test;

public class MyDateTest {

    @Test
    public void dateTestOne(){
        //Given
        MyDate date;

        //When
        date = new MyDate(11,11,1918);
        String actual = date.toString();

        //Then
        String expected = "11/11/1918";
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void dateTestTwo(){
        // Given
        MyDate date = new MyDate();

        // When
        date.day = 22;
        date.month = 6;
        date.year = 1996;
        String actual = date.toString();

        //Then
        String expected = "6/22/1996";
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void dateTestThree(){

        // Given
        MyDate date = new MyDate();

        // When
        date.setDate(4,21,1968);
        String actual = date.toString();

        // Then
        String expected = "4/21/1968";
        Assert.assertEquals(expected,actual);
    }


}