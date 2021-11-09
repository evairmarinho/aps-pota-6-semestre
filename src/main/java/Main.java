/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import models.Mapper;
import models.Sortable;
import models.sorts.*;
import utils.Helper;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author Evair Marinho
 */

public class Main {

    static int[] array5;
    static int[] array10;
    static int[] array50;
    static int[] array100;
    static int[] array1000;
    static int[] array10000;

    public static void main(String[] args) {
        array5 = Helper.generateArray(5);
        array10 = Helper.generateArray(10);
        array50 = Helper.generateArray(50);
//        array100 = Helper.generateArray(100);
//        array1000 = Helper.generateArray(1000);
//        array10000 = Helper.generateArray(10000);

        Mapper.setAverageMap();

        Sortable sortable = new BubbleSort();
        executeSort(sortable);
        System.out.print("MEDIA BUBBLE SORT: " + calculateAverage(Mapper.BUBBLE_SORT));
    }

    public static void executeSort(Sortable sortable) {
        sortable.sort(array5);
        sortable.sort(array10);
        sortable.sort(array50);
        sortable.sort(array100);
        sortable.sort(array1000);
        sortable.sort(array10000);
    }

    public static String calculateAverage(Integer key) {
        HashMap<Integer, Integer> compare = Mapper.comparationMap;
        int total = 0;

        for (Map.Entry<Integer,Integer> pair : compare.entrySet()) {
            total += pair.getValue();
        }

        double average = (double) total / compare.size();

        Mapper.averageMap.put(key, average);

        return String.format("%.2f", average);
    }
}
