package org.example;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.testng.Assert.*;

public class DescOrAscTest {
    DescOrAsc descOrAsc = new DescOrAsc();

    @DataProvider
    public Object[][] ascendingNumbers() {
        return new Object[][] {
                {new ArrayList<Integer>(
                        Arrays.asList(2, 4, 7, 8)
                )},
                {new ArrayList<Integer>(
                        Arrays.asList(7, 8, 9, 10)
                )},
                {new ArrayList<Integer>(
                        Arrays.asList(11, 55, 342, 555)
                )},
        };
    }

    @Test(dataProvider = "ascendingNumbers")
    public void should_returnTrue_when_numbersAreInAscendingOrder(List<Integer> numbers) {
        // Arrange  // Given
        // Act      // When
        System.out.println(numbers);

        boolean result = descOrAsc.isAscending(numbers);
        // Assert   // Then

        assertTrue(result);
    }

}