package models.sorts;

import models.Mapper;
import models.Sortable;

import java.util.HashMap;

public class BubbleSort implements Sortable {

    @Override
    public void sort(int[] array) {
        if (array == null) {
            return;
        }

        HashMap<Integer, Integer> map = Mapper.resetComparationMap();

        int size = array.length;
        for (int i = 0; i < size - 1; i++) {

            for (int j = 0; j < size - i - 1; j++) {
                if (array[j] > array[j+1]) {
                    int temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;

                    map.put(size, map.get(size) + 1);
                }
            }
        }
    }
}
