package org.questions;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class MedianOfMergeTest {

    @Test
    void merge() {
        assertEquals("[7, 8, 9, 2, 5, 4, 10, 8, 10, 1, 6, 3, 5, 4, 11, 7]", Arrays.toString(MedianOfMerge.merge(new int[] {7, 8, 9, 2, 5, 4, 10, 8}, new int[] {10, 1, 6, 3, 5, 4, 11, 7})));
    }

    @Test
    void sort() {
        assertEquals("[1, 2, 3, 4, 4, 5, 5, 6, 7, 7, 8, 8, 9, 10, 10, 11]", Arrays.toString(MedianOfMerge.sort(new int[] {7, 8, 9, 2, 5, 4, 10, 8, 10, 1, 6, 3, 5, 4, 11, 7})));
    }

    @Test
    void median() {
        assertEquals(6.5, MedianOfMerge.median(new int[] {1, 2, 3, 4, 4, 5, 5, 6, 7, 7, 8, 8, 9, 10, 10, 11}));
    }


}