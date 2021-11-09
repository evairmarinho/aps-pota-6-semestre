package models.sorts;

import models.Mapper;
import models.Sortable;

import java.util.HashMap;

public class SelectionSort implements Sortable {

    @Override
    public void sort(int[] array) {
        if (array == null) {
            return;
        }

        HashMap<Integer, Integer> map = Mapper.resetComparationMap();

        int size = array.length;
        for (int i = 0; i < size - 1; i++) {
            int min = i;

            for (int j = i+1; j < size; j++) {

                if (array[j] < array[min]) {
                    min = j;

                    map.put(size, map.get(size) + 1);
                }
            }

            int temp = array[min];
            array[min] = array[i];
            array[i] = temp;
        }
    }

}
