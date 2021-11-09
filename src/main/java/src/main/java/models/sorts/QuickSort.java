package models.sorts;

import models.Mapper;
import models.Sortable;

import java.util.HashMap;

public class QuickSort implements Sortable {

    @Override
    public void sort(int[] array) {
        if (array == null) {
            return;
        }

        HashMap<Integer, Integer> map = Mapper.resetComparationMap();

        quickSort(array, 0, array.length - 1, map, array.length);
    }

    private void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    private int partition(int[] arr, int low, int high) {
        int pivot = arr[high];

        int i = (low - 1);

        for(int j = low; j <= high - 1; j++) {
            if (arr[j] < pivot) {
                i++;
                swap(arr, i, j);
            }
        }

        swap(arr, i + 1, high);

        return (i + 1);
    }

    private void quickSort(int[] array, int low, int high, HashMap<Integer, Integer> map, int size) {
        if (low < high) {
            int pi = partition(array, low, high);

            quickSort(array, low, pi - 1, map, size);
            quickSort(array, pi + 1, high, map, size);

            map.put(size, map.get(size) + 1);
        }
    }

}
