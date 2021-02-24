package com.janjanee.infthejavatest;

import org.junit.jupiter.api.*;
import org.junit.jupiter.api.condition.*;

class StudyTest {

    @Test
    @EnabledIfEnvironmentVariable(named = "TEST_ENV", matches = "LOCAL")
    void test_1() {
        System.out.println("I'm MAC!");
    }

    @Test
    @EnabledIfEnvironmentVariable(named = "TEST_ENV", matches = "janjanee")
    void test_2() {
        System.out.println("I'm Janjanee");
    }

}