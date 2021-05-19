package com.wfxuni.pattern.singleton;

/**
 * 在内部类被加载和初始化时，才创建INSTANCE实例对象
 * 静态内部类不会自动随着外部类的加载和初始化而初始化，它要单独去加载和初始化
 */
public class Singleton6 {

    private Singleton6() {
    }

    private static class Inner {
        private static final Singleton6 INSTANCEC = new Singleton6();
    }

    public static Singleton6 getInstance() {
        return Inner.INSTANCEC;
    }
}
