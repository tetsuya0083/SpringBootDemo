package com.estsoft;

import org.assertj.core.api.Assertions;
//import org.junit.jupiter.api.Assertions;

import org.junit.jupiter.api.Test;

public class AssertJTest {
    @Test
    public void test(){
        int a = 3;
        int b = 1;
        int result = 4;
        Assertions.assertThat(a+b).isEqualTo(result);
//        Assertions.assertEquals(result, a+b);

    }
}
