package sandbox;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class ArraysSandbox {

    public static void main(String[] args) {

        int[] array = {0, 1, 3, 4, 2};
        System.out.println("Array: " + Arrays.toString(array));
        System.out.println("Array length: " + array.length);

        //List<Integer> myList = Arrays.stream(array).boxed().toList();                     // Creates an immutable List
        List<Integer> myList = Arrays.stream(array).boxed().collect(Collectors.toList());   // Creates a mutable List

        System.out.println("Array as List: " + myList);

        Collections.sort(myList);
        System.out.println("Sorted List: " + myList);
    }    
}
