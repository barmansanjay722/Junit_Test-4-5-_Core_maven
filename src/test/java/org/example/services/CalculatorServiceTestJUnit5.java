package org.example.services;

import org.junit.jupiter.api.*;

public class CalculatorServiceTestJUnit5 {

    //   before all test cases
    @BeforeAll
    public static void init(){
        System.out.println("Before All test Case");
    }

    //   after all test cases
    @AfterAll
    public static void clearnUp() {
        System.out.println("After all test case ");
    }

    //   before each test case
    @BeforeEach
    public void eachTestCaseStart() {
        System.out.println("Before each");
    }

    //   after each test case
    @AfterEach
    public void eachTestCaseAfter() {
        System.out.println("after each");
    }

    @Test
    @DisplayName("This is custome name")                        // giving custome name to test case
    public void addTwoNumbersTest() {
        System.out.println("Fist Test Case");
        int actualResult = CalculatorService.addTwoNumbers(12,12);
        int expectResult = 24;
        Assertions.assertEquals(expectResult,actualResult);
    }

    @Test
    @Disabled                                                   // disable test case
    public void sumAnyNUmbersTest() {
        System.out.println("Second Test Case");
        int actualResult = CalculatorService.sumAnyNUmbers(1,3,4);
        int expected = 8;
        Assertions.assertEquals(expected,actualResult,"Test Fail");
    }

/*    // other tags
    @Tag     // class or method to tag
    @Nested     // usign for nested class
    @TestFactory*/
}
