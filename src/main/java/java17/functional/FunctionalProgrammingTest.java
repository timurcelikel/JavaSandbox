package java17.functional;

import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class FunctionalProgrammingTest {

    private FunctionalProgramming functionalProgramming;

    @Before
    public void setUp() {
        functionalProgramming = new FunctionalProgramming();
    }

    @Test
    public void functionalSortTest() {

        // This returns an unmodifiable list and therefore UnsupportedOperationException
        //List<String> unsortedList = List.of("z", "a", "t", "m");
        List<String> unsortedList = Arrays.asList("z", "a", "t", "m");
        final List<String> actualSortedList = functionalProgramming.functionalSort(unsortedList);
        List<String> expectedSortedList = List.of("a", "m", "t", "z");
        assertEquals(expectedSortedList, actualSortedList);
    }

    @Test
    public void naturalOrderSortTest() {

        List<String> unsortedList = Arrays.asList("z", "a", "t", "m");
        final List<String> actualSortedList = functionalProgramming.naturalOrderSort(unsortedList);
        List<String> expectedSortedList = List.of("a", "m", "t", "z");
        assertEquals(expectedSortedList, actualSortedList);
    }

    @Test
    public void basicConsumerTest() {

        functionalProgramming.basicBasicConsumer();
    }
}
