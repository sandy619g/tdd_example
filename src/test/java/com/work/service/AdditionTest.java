package com.work.service;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class AdditionTest {

    Addition addition = new Addition();

    @Test
    public void when_both_parameters_are_positive(){
        int result = addition.add(5,10);
        Assertions.assertEquals(15,result);
    }

    @Test
    public void when_both_parameters_are_negative(){
        int result = addition.add(-5,-10);
        Assertions.assertEquals(-15,result);
    }

    @Test
    public void when_one_parameter_has_max_value(){
        int a = Integer.MAX_VALUE;
        int result = addition.add(a,10);
        Assertions.assertTrue(result<0);
    }

    @Test
    public void when_one_parameter_has_min_value(){
        int a = Integer.MIN_VALUE;
        int result = addition.add(a,10);
        System.out.println(result);
        Assertions.assertTrue(result<0);
    }

    @Test
    public void when_one_parameter_has_min_value_and_other_max_value(){
        int a = Integer.MIN_VALUE;
        int b = Integer.MAX_VALUE;
        int result = addition.add(a,b);
        Assertions.assertEquals(-1,result);
    }


}
