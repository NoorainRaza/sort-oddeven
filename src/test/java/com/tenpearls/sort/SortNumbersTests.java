package com.tenpearls.sort;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = SortApplication.class)
public class SortNumbersTests {

    @Autowired
    private SortNumbers sortNumbers;

    private Integer[] numbers;
    private Integer[] evenNumbers;
    private Integer[] oddNumbers;
    private Integer[] negativeNumbers;
    private Integer[] duplicateNumbers;
    private Integer[] moreNumbers;

    private Integer[] numbersSorted;
    private Integer[] evenNumbersSorted;
    private Integer[] oddNumbersSorted;
    private Integer[] negativeNumbersSorted;
    private Integer[] duplicateNumbersSorted;
    private Integer[] moreNumbersSorted;


    @Before
    public void initInputs() {
        numbers = new Integer[] {1, 2, 4, 3, 7, 16};
        oddNumbers = new Integer[] {3, 1, 7, 15, 29, 5, 9};
        evenNumbers = new Integer[] {4, 2, 6, 14, 28, 8, 16};
        negativeNumbers = new Integer[] {-1, -2, -4, -3, -7, -16};
        duplicateNumbers = new Integer[] {1, 2, 4, 3, 7, 16, 7, 2, 4, 1, 16};
        moreNumbers = new Integer[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 19, 18, 17, 16, 15, 14, 13, 12, 11};

        numbersSorted = new Integer[] {1, 3, 7, 2, 4, 16};
        oddNumbersSorted = new Integer[] {1, 3, 5, 7, 9, 15, 29};
        evenNumbersSorted = new Integer[] {2, 4, 6, 8, 14, 16, 28};
        negativeNumbersSorted = new Integer[] {-7, -3, -1, -16, -4, -2};
        duplicateNumbersSorted = new Integer[] {1, 1, 3, 7, 7, 2, 2, 4, 4, 16, 16};
        moreNumbersSorted = new Integer[] {1, 3, 5, 7, 9, 11, 13, 15, 17, 19, 2, 4, 6, 8, 10, 12, 14, 16, 18};
    }

    @Test
    public void oddEvenSortTest() {
        sortNumbers.oddEvenSort(numbers);
        Assert.assertArrayEquals(numbers, numbersSorted);
    }

    @Test
    public void oddEvenSort_withOddNumbersTest() {
        sortNumbers.oddEvenSort(oddNumbers);
        Assert.assertArrayEquals(oddNumbers, oddNumbersSorted);
    }

    @Test
    public void oddEvenSort_withEvenNumbersTest() {
        sortNumbers.oddEvenSort(evenNumbers);
        Assert.assertArrayEquals(evenNumbers, evenNumbersSorted);
    }

    @Test
    public void oddEvenSort_withNegativeNumbersTest() {
        sortNumbers.oddEvenSort(negativeNumbers);
        Assert.assertArrayEquals(negativeNumbers, negativeNumbersSorted);
    }

    @Test
    public void oddEvenSort_withDuplicateNumbersTest() {
        sortNumbers.oddEvenSort(duplicateNumbers);
        Assert.assertArrayEquals(duplicateNumbers, duplicateNumbersSorted);
    }
}
