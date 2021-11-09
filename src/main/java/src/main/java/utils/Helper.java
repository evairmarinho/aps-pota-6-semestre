package utils;

import java.util.Arrays;
import java.util.Random;
import java.util.stream.IntStream;

public class Helper {

    public static int[] generateArray(int arraySize) {
        return IntStream.generate(() -> new Random().nextInt(100)).limit(arraySize).toArray();
    }

    public static void printArray(int[] array) {
        Arrays.toString(array);
    }
}
