package org.example;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class TestingTest {

    Testing testing;


    @Test
    public  void shouldFormatString(){
        String exp = "demo";
        String expected = "Formatted" + exp;

        String actual = Testing.format(exp);

        System.out.println(expected);
        System.out.println(actual);
        Assertions.assertEquals(actual, expected);
    }


    @Test
    public  void shouldNotFormatAnInvalidString(){
        String exp = "hello";
        String expected = "Formatted" + exp;

        String actual = Testing.format(exp);

        System.out.println(expected);
        System.out.println(actual);
        Assertions.assertNotEquals(actual, expected);
    }




}