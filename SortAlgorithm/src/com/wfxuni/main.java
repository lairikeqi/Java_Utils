package com.wfxuni;

import com.wfxuni.sort.util.SortUtil;

import java.util.Arrays;

public class main {

    public static void main(String[] args) {

        int arr[] = {1, 8, 2, 4, 7, 3, 9, 5, 6, 11, 15, 13};
        int arr2[] = {1, 8, 2, 4, 7, 3, 9, 5, 6, 11, 15, 13};

        SortUtil.BubbleSort(arr);
        System.out.println("冒泡排序：" + Arrays.toString(arr));

        SortUtil.QuickSort(arr2, 0, arr2.length - 1);
        System.out.println("快速排序：" + Arrays.toString(arr2));

    }
}
