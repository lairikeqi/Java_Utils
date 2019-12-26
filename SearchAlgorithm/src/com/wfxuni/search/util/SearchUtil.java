package com.wfxuni.search.util;

public class SearchUtil {

    /**
     * 二分查找  在arr数组中查找key的index，找不到返回-1
     * <p>
     * mid=(begin+end)/2，比较arr[mid]的值与key的大小，if相同返回index
     * if arr[mid]<key，begin=mid+1，else arr[mid]>key，end=mid-1
     * 然后循环，直到 end<begin返回-1 或者 arr[mid]=key返回mid
     */
    public static int binarySearch(int[] arr, int key) {
        int begin = 0;
        int end = arr.length - 1;
        while (begin <= end) {
            int mid = (begin + end) / 2;
            if (arr[mid] == key) {
                return mid;
            } else if (arr[mid] < key) {
                begin = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return -1;
    }
}
