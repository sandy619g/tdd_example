package com.work.service;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RomanToIntTest {

    RomanToInt romanInt = new RomanToInt();

    @Test
    public void when_parameter_is_valid(){
        String romanStr = "I";
        int i = romanInt.convert(romanStr);
        Assertions.assertEquals(1,i);
    }

    @Test
    public void when_parameter_is_II(){
        String romanStr = "II";
        int i = romanInt.convert(romanStr);
        Assertions.assertEquals(2,i);
    }
    @Test
    public void when_parameter_is_III(){
        String romanStr = "III";
        int i = romanInt.convert(romanStr);
        Assertions.assertEquals(3,i);
    }

    @Test
    public void when_parameter_is_V(){
        String romanStr = "V";
        int i = romanInt.convert(romanStr);
        Assertions.assertEquals(5,i);
    }
    @Test
    public void when_parameter_is_X(){
        String romanStr = "X";
        int i = romanInt.convert(romanStr);
        Assertions.assertEquals(10,i);
    }

    @Test
    public void when_parameter_is_VI(){
        String romanStr = "VI";
        int i = romanInt.convert(romanStr);
        Assertions.assertEquals(6,i);
    }

    @Test
    public void when_parameter_is_IV(){
        String romanStr = "IV";
        int i = romanInt.convert(romanStr);
        Assertions.assertEquals(4,i);
    }

    @Test
    public void when_parameter_is_90(){
        String romanStr = "XC";
        int i = romanInt.convert(romanStr);
        Assertions.assertEquals(90,i);
    }

}
