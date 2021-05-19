package com.wfxuni.batch;

import java.util.List;

/**
 * 分批处理list
 */
@FunctionalInterface
public interface CommonResolve {

    void resolve(List items);
}