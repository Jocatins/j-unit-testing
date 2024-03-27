package com.example;

import java.util.Arrays;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;

public class CalculatorTest {
    @Test
    @DisplayName("It should pass when the first number is greater than the second")
    public void compare() {

        Calculator calculator = new Calculator();
        int result = calculator.compare(22, 21);

        Assertions.assertEquals(1, result);

    }

    @Test
    @DisplayName("It should pass when the second number is more than the first")
    public void testCompare1() {

        Calculator calculator = new Calculator();
        int result = calculator.compare1(2, 21);

        Assertions.assertEquals(-1, result);

    }

    @Test
    @DisplayName("The both numbers should be equal to the other")
    public void testCompare2() {

        Calculator calculator = new Calculator();
        int result = calculator.compare2(3, 3);

        Assertions.assertEquals(1, result);

    }

    @Test
    @DisplayName("Array sorted")
    public void testSortArray() {

        Calculator calculator = new Calculator();

        int[] array = { 5, 8, 3, 9, 1, 6 };
        int[] sortedArray = array.clone(); // Create a copy of the original array
        Arrays.sort(sortedArray);
        calculator.sortArray(sortedArray); // Sort the copied array

        Assertions.assertArrayEquals(sortedArray, array);

    }

}
