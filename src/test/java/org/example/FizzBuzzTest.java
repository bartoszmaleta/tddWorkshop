package org.example;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class FizzBuzzTest {

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
        FizzBuzz fizzBuzz = new FizzBuzz();

        // Act      // When
        String result = fizzBuzz.accept(n);

        // Assert   // Then
        assertEquals(result, String.valueOf(n));
    }

}