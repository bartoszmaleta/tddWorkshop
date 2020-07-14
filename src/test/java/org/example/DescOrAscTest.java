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
                {new ArrayList<>(
                        Arrays.asList(2, 4, 7, 8)
                )},
                {new ArrayList<>(
                        Arrays.asList(7, 8, 9, 10)
                )},
                {new ArrayList<>(
                        Arrays.asList(11, 55, 342, 555)
                )},
        };
    }

    @Test(dataProvider = "ascendingNumbers")
    public void should_returnTrue_when_numbersAreInAscendingOrder(List<Integer> numbers) {
        // Arrange  // Given
        // Act      // When
        System.out.println(numbers);

        boolean result = descOrAsc.isSorted(numbers);
        // Assert   // Then

        assertTrue(result);
    }

    @DataProvider
    public Object[][] descendingNumbers() {
        return new Object[][] {
                {new ArrayList<>(
                        Arrays.asList(10, 5, 2)
                )},
                {new ArrayList<>(
                        Arrays.asList(104, 54, 22)
                )},
                {new ArrayList<>(
                        Arrays.asList(1012, 543, 22)
                )},
                {new ArrayList<>(
                        Arrays.asList(101, 52, 2)
                )},
        };
    }

    @Test(dataProvider = "descendingNumbers")
    public void should_returnTrue_when_numbersAreInDescendingOrder(List<Integer> numbers) {
        // Act
        boolean result = descOrAsc.isSorted(numbers);

        // Assert
        assertTrue(result);
    }

    @DataProvider
    public Object[][] notOrderedNumbers() {
        return new Object[][] {
                {new ArrayList<>(
                        Arrays.asList(10, 5, 22)
                )},
                {new ArrayList<>(
                        Arrays.asList(104, 542, 22)
                )},
                {new ArrayList<>(
                        Arrays.asList(1012, 5423, 22)
                )},
                {new ArrayList<>(
                        Arrays.asList(10, 52, 2)
                )},
        };
    }

    @Test(dataProvider =  "notOrderedNumbers")
    public void should_returnFalse_when_numbersAreNotOrdered(List<Integer> numbers) {
        // Act
        boolean result = descOrAsc.isSorted(numbers);

        // Assert
        assertFalse(result);
    }

    @DataProvider
    public Object[][] numbersWithDuplicates() {
        return new Object[][] {
                {new ArrayList<>(
                        Arrays.asList(10, 5, 10)
                )},
                {new ArrayList<>(
                        Arrays.asList(104, 104, 22)
                )},
                {new ArrayList<>(
                        Arrays.asList(1012, 22, 22)
                )},
                {new ArrayList<>(
                        Arrays.asList(10, 2, 10)
                )},
        };
    }

    @Test(dataProvider =  "numbersWithDuplicates")
    public void should_returnFalse_when_numbersHaveDuplicates(List<Integer> numbers) {
        // Act
        boolean result = descOrAsc.isSorted(numbers);

        // Assert
        assertFalse(result);
    }

}