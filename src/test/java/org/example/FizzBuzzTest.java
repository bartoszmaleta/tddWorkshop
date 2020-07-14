package org.example;

import org.testng.ITest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class FizzBuzzTest {
    FizzBuzz fizzBuzz = new FizzBuzz();


    @DataProvider
    public Object[][] numbersNotDivisibleBy3Nor5() {
        return new Object[][] {
                {1},
                {2},
                {4},
        };
    }

    @Test(dataProvider = "numbersNotDivisibleBy3Nor5")
    public void should_returnANumber_when_notDivisibleBy3Nor5(int n) {
        // Arrange  // Given
        // Act      // When
        String result = fizzBuzz.accept(n);

        // Assert   // Then
        assertEquals(result, String.valueOf(n));
    }


    @DataProvider
    public Object[][] numbersDivisibleBy3() {
        return new Object[][] {
                {3},
                {33},
                {399},
        };
    }

    @Test(dataProvider = "numbersDivisibleBy3")
    public void should_returnFizz_when_numberIsDivisibleBy3(int n) {
        // Arrange
        // Act
        String result = fizzBuzz.accept(n);

        // Assert
        assertEquals(result, "fizz");
    }

}