package org.example;

import org.junit.Test;

import static org.testng.Assert.*;

public class FizzBuzzTest {

    @Test
    public void should_returnANumber_when_notDivisibleBy3Nor5() {
        // Arrange  // Given
        int n = 1;
        FizzBuzz fizzBuzz = new FizzBuzz();

        // Act      // When
        String result = fizzBuzz.accept(n);

        // Assert   // Then
        assertEquals(result, String.valueOf(n));
    }

}