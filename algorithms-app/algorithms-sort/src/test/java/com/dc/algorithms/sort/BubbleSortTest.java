package com.dc.algorithms.sort;

import static org.junit.Assert.assertArrayEquals;
import org.junit.Before;
import org.junit.Test;

import com.dc.algorithms.sort.strategy.BubbleSort;


public class BubbleSortTest {

	private BubbleSort testClass;

    @Before
    public void setUp() {
        testClass = new BubbleSort();
    }

    @Test
    public void bubbleSortTest1Success() {
        int[] numbers = new int[] { 1, 7, 99, 2, 0, 12, 15 };
        testClass.sort(numbers);
        
        assertArrayEquals(new int[] { 0, 1, 2, 7, 12, 15, 99 }, numbers);
    }

    @Test
    public void bubbleSortTest2Success() {
        int[] numbers = new int[] { 8, 5, 3, 1, 9, 6, 0, 7, 4, 2, 5 };
        testClass.sort(numbers);

        assertArrayEquals(new int[] { 0, 1, 2, 3, 4, 5, 5, 6, 7, 8, 9 }, numbers);
    }

    @Test
    public void bubbleSortTest3Success() {
        int[] numbers = new int[] { 10, 9, 8, 7, 6, 5, 4, 3, 2, 1, 0 };
        testClass.sort(numbers);

        assertArrayEquals(new int[] { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 }, numbers);
    }
}
