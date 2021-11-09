package models.sorts;

import models.Mapper;
import models.Sortable;

import java.util.HashMap;

public class MergeSort implements Sortable {

    @Override
    public void sort(int[] array) {
        if (array == null) {
            return;
        }

        HashMap<Integer, Integer> map = Mapper.resetComparationMap();

        sort(array, 0, array.length - 1, map, array.length);
    }

    void merge(int[] array, int first, int middle, int last) {
        int n1 = middle - first + 1;
        int n2 = last - middle;

        int[] L = new int[n1];
        int[] R = new int[n2];

        for (int i = 0; i < n1; ++i) {
            L[i] = array[first + i];
        }

        for (int j = 0; j < n2; ++j) {
            R[j] = array[middle + 1 + j];
        }

        int i = 0, j = 0;

        int k = first;
        while (i < n1 && j < n2) {
            if (L[i] <= R[j]) {
                array[k] = L[i];
                i++;
            } else {
                array[k] = R[j];
                j++;
            }

            k++;
        }

        while (i < n1) {
            array[k] = L[i];
            i++;
            k++;
        }

        while (j < n2) {
            array[k] = R[j];
            j++;
            k++;
        }
    }

    void sort(int[] array, int fisrt, int last, HashMap<Integer, Integer> map, int size) {
        if (fisrt < last) {
            int middle = fisrt + (last-fisrt) / 2;

            sort(array, fisrt, middle, map, size);
            sort(array, middle + 1, last, map, size);

            merge(array, fisrt, middle, last);

            map.put(size, map.get(size) + 1);
        }
    }

}
