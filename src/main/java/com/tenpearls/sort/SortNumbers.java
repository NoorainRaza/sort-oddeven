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
        Arrays.asList(numbers).sort(new Comparator<Integer>() {
            @Override
            public int compare(Integer x, Integer y) {
                if ((x % 2 == 0 && y % 2 == 0) || (x % 2 != 0 && y % 2 != 0)) {
                    return Integer.compare(x, y);
                }
                if ((x&1) == 0) {
                    return 1;
                }
                return -1;
            }
        });
    }
}
