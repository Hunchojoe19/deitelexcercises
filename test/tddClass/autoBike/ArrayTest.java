package tddClass.autoBike;

import ClassWork.Array;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ArrayTest {

    private Array kata;
    @BeforeEach
    public void joe () {
        kata = new Array();

    }
        @Test
        public void maximumNumberInArrayTest () {
            Array kata = new Array();
            int[] scores = {34, 23, 14, 45, 23};
            assertEquals(45, kata.findMaximumfrom(scores));
        }
        @Test
        public void minimumNumberInArrayTest () {
        int [] scores = {34, 23, 14, 45, 23};
        assertEquals(14, kata.findMinimumfrom(scores));

        }
        @Test
    public void averageInArrayTest(){
        int []scores = {34, 23, 14, 45, 23};
        assertEquals(27, kata.findAveragefrom(scores));
        }
    }

