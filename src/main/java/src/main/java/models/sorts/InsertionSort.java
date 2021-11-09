package models.sorts;

import models.Mapper;
import models.Sortable;

import java.util.HashMap;

public class InsertionSort implements Sortable {

    @Override
    public void sort(int[] array) {
        if (array == null) {
            return;
        }

        HashMap<Integer, Integer> map = Mapper.resetComparationMap();

        int size = array.length;
        for (int i = 1; i < size; ++i) {
            int key = array[i];
            int j = i - 1;

            while (j >= 0 && array[j] > key) {
                array[j + 1] = array[j];
                j = j - 1;

                map.put(size, map.get(size) + 1);
            }

            array[j + 1] = key;
        }
    }

}
