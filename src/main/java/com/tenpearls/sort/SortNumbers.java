package com.tenpearls.sort;


import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.Comparator;

/**
 * This class sorts numbers as following requirement:
 *
 * sort a list of numbers so that odd numbers are sorted before even numbers, and relative order is preserved
 */
@Component
public class SortNumbers {
    /**
     * Method takes numbers array and sorts them as required.
     *
     * @param numbers
     */
    public void oddEvenSort(Integer[] numbers) {

        int numbersSize = numbers.length;
        int j = -1, temp;
        for (int i = 0; i < numbersSize; i++) {

            if (numbers[i] % 2 != 0) {

                j++;
                if (i > 0) {
                    for (int k = i - 1; k >= j; k--) {
                        if (numbers[k] % 2 == 0) {

                            temp = numbers[k+1];
                            numbers[k+1] = numbers[k];
                            numbers[k] = temp;
                        }
                    }
                }
            }
        }
    }
}
