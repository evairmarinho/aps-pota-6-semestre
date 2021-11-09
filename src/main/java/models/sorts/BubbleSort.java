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

        for (int i = 1; i < array.length; i++) {
            int size = array.length;

            for (int j = 0; j < size - i; j++) {
                if (array[j] > array[j + 1]) {
                    int aux = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = aux;

                    map.put(size, map.get(size) + 1);
                }
            }
        }
    }
}
