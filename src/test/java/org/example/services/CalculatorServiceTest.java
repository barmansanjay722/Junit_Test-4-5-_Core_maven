/*package org.example.services;

import org.junit.*;

import java.util.Date;

public class CalculatorServiceTest {

    int counter = 0;

//   before all test caeses
    @BeforeClass
    public static void init() {
        System.out.println("Before all test caeses");
        System.out.println("Sarted test: "+new Date());
        // connection open file
    }

    // before each test case execute
    @Before
    public void beforeEach() {
        System.out.println("Before each test case");
        counter = 0;
    }
    // test method of add two numbers
    @Test(timeout = 2000)     // timeout -> if the logic taking much time then 2 sec then function will get timeout (test fail)
    public void addTwoNumbersTest() throws InterruptedException {
        for (int i = 1; i <= 20; i++) {
            counter++;
        }

//        Thread.sleep(3000);
        System.out.println("test for addTwoNumbersTest");
        int result = CalculatorService.addTwoNumbers(12,45);
        int expected = 57;
        System.out.println("Counter after first test case "+counter);
        Assert.assertEquals(expected,result);
    }

    @After
    public void afterEach() {
        System.out.println("After each test case");
    }

    @Test
    public void sumAnyNUmbersTest() {
        for (int i = 1; i <= 10; i++) {
            counter++;
        }
        System.out.println("test for sunAnyNumbersTest");
        int result = CalculatorService.sumAnyNUmbers(2,7,8,9);
        int expected = 26;
        System.out.println("Counter after first test case "+counter);
        Assert.assertEquals(expected,result);
    }

    // after all test cases
    @AfterClass
    public static void cleanup() {
        System.out.println("After all test cases");
        System.out.println("End test cases : "+new Date());
    }

    // Test
    //BeforeClass
    //AfterClass
    //Before
    //After
}*/
