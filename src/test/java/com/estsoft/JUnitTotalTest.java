package com.estsoft;

import org.junit.jupiter.api.*;

public class JUnitTotalTest {
    @BeforeAll
    public static void beforeAll(){
        System.out.println("@BeforeAll");
    }

    @BeforeEach
    public void beforeEach(){
        System.out.println("@BeforeEach");
    }

    @Test
    public void test(){
        System.out.println("test1");
    }

    @Test
    public void test2(){
        System.out.println("Test2");
    }

    @AfterEach
    public void afterEach(){
        System.out.println("@AfterEach");
    }

    @AfterAll
    public static void afterAll(){
        System.out.println("@AfterAll");
    }
}
