package com.fakecompany.calculator;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTest {

    private Calculator calc;

    @BeforeEach
    void setUp() {
        calc = new Calculator();
    }

    @Test
    public void shouldReturnZeroWhenAddZeroPlusZero () {
        int sum = calc.add(0, 0);
        assertEquals(0, sum, "Expected sum of zero");
    }

    @Test
    public void shouldReturnTwoWhenAddTwoPlusTwo () {
        int sum = calc.add(1, 1);
        assertEquals(2, sum);
    }

    @Test
    public void shouldReturnZeroWhenAddNegativeOnePlusOne () {
        int sum = calc.add(-1, 1);
        assertEquals(0, sum);
    }

    @Test
    public void shouldReturnNegativeTwoWhenAddNegativeOnePlusNegativeOne () {
        int sum = calc.add(-1, -1);
        assertEquals(-2, sum);
    }

    @Test
    public void shouldReturnZeroWhenSubtractZeroAndZero () {
        int subtraction = calc.subtract(0,0);
        assertEquals(0,subtraction);
    }

    @Test
    public void shouldReturnNegativeOneWhenSubtractNegativeOneAndZero () {
        int subtraction = calc.subtract(-1,0);
        assertEquals(-1, subtraction);
    }

    @Test
    public void shouldCalculateCorrectAnnuityForGivenInputs() {
        String principal = "22000";
        int years = 7;
        String rate = ".06";
        int compPerYear = 1;

        String answer = calc.calcAnnuity(principal, years, rate, compPerYear);

        String expected = "$184,664.43";
        assertEquals(expected, answer);
    }
}
