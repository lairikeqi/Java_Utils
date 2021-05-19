package com.wfxuni.batch;

import java.util.List;

public class BatchHandler<T> {

    private int num;

    public void batchResolve(List<T> list, int batchSize, CommonResolve resolve) {
        if(null == list || list.size() ==0) {
            return;
        }
        for (int i = 0; i < list.size(); i += batchSize) {
            this.num++;
            int end = i + batchSize;
            if (end > list.size()) {
                end = list.size();
            }
            List<T> items = list.subList(i, end);
            resolve.resolve(items);
        }
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }
}
