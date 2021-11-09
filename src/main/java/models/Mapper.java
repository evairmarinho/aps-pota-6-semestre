package models;

import java.util.HashMap;

public class Mapper {

    public static final Integer BUBBLE_SORT = 1;
    public static final Integer SELECTION_SORT = 2;
    public static final Integer INSERTION_SORT = 3;
    public static final Integer MERGE_SORT = 4;
    public static final Integer QUICK_SORT = 5;

    public static final Integer ARRAY_5 = 5;
    public static final Integer ARRAY_10 = 10;
    public static final Integer ARRAY_50 = 50;
    public static final Integer ARRAY_100 = 100;
    public static final Integer ARRAY_1000 = 1000;
    public static final Integer ARRAY_10000 = 10000;

    public static HashMap<Integer, Double> averageMap;
    public static HashMap<Integer, Integer> comparationMap;

    public static void setAverageMap() {
        averageMap = new HashMap<>();
        averageMap.put(BUBBLE_SORT, 0.0);
        averageMap.put(SELECTION_SORT, 0.0);
        averageMap.put(INSERTION_SORT, 0.0);
        averageMap.put(MERGE_SORT, 0.0);
        averageMap.put(QUICK_SORT, 0.0);
    }

    public static HashMap<Integer, Integer> resetComparationMap() {
        comparationMap = new HashMap<>();
        comparationMap.put(ARRAY_5, 0);
        comparationMap.put(ARRAY_10, 0);
        comparationMap.put(ARRAY_50, 0);
        comparationMap.put(ARRAY_100, 0);
        comparationMap.put(ARRAY_1000, 0);
        comparationMap.put(ARRAY_10000, 0);
        return comparationMap;
    }
}
