package com.scvconsultants.tests;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;

public class TestSimpleThreads {
    // set up VM options in run config:
    // -Djunit.jupiter.execution.parallel.enabled=true
    // -Djunit.jupiter.execution.parallel.mode.default=concurrent

    @BeforeAll
    public static void start() {
        System.out.println("=======Starting junit 5 tests========");
    }

    @BeforeEach
    public void setup() {
        System.out.println("=======Setting up the prerequisites========");

    }
    @Test
    void shouldRunFirstTest() {
        System.out.println(Thread.currentThread().getStackTrace()[1]
                .getMethodName()+" => executed successfully");
    }

    @Test
    void shouldRunSecondTest() {
        System.out.println(Thread.currentThread().getStackTrace()[1]
                .getMethodName()+" => executed successfully");
    }

    @Test
    void shouldRunThirdTest() {
        System.out.println(Thread.currentThread().getStackTrace()[1]
                .getMethodName()+" => executed successfully");
    }
    @Test
    void shouldRunFourthTest() {
        System.out.println(Thread.currentThread().getStackTrace()[1]
                .getMethodName()+" => executed successfully");
    }


    @AfterEach
    public void tearDown() {
        System.out.println("Tests ended");
    }

    @AfterAll
    public static void end() {
        System.out.println("All the tests are executed");

    }
}
