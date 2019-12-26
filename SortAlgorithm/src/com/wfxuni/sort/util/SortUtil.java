package com.wfxuni.sort.util;

/**
 * 排序算法
 */
public class SortUtil {

    /**
     * 冒泡排序： 大数冒泡，大数浮到数组尾
     * 算法的时间复杂度为 O(n^2)
     */
    public static void BubbleSort(int arr[]) {

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    /**
     * 快速排序：找到基准数，比基准数小的放在基准数左边，比基准数大的放在基准数右边
     * 算法的平均时间复杂度为O(nlogn),最差为O(n^2)
     */
    public static void QuickSort(int arr[], int start, int end) {
        if (start >= end) {
            return;
        }
        int i = start;
        int j = end;
        // 基准数
        int baseval = arr[start];
        while (i < j) {
            // 从右向左找比基准数小的数
            while (i < j && arr[j] >= baseval) {
                j--;
            }
            if (i < j) {
                arr[i] = arr[j];
                i++;
            }
            // 从左向右找比基准数大的数
            while (i < j && arr[i] < baseval) {
                i++;
            }
            if (i < j) {
                arr[j] = arr[i];
                j--;
            }
        }
        // 把基准数放到i的位置
        arr[i] = baseval;
        //递归调用左半数组
        QuickSort(arr, start, i - 1);
        //递归调用左半数组
        QuickSort(arr, i + 1, end);
    }

}