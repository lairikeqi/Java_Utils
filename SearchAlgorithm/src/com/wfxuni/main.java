package com.wfxuni;

import com.wfxuni.search.util.SearchUtil;

public class main {

    public static void main(String[] args) {
        int arr[] = {1, 2, 4, 6, 8, 9, 11, 12, 14, 15, 17, 19};
        System.out.println("二分查找key位置：" + SearchUtil.binarySearch(arr, 11));
    }
}
