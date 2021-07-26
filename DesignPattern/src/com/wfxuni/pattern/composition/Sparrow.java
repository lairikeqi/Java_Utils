package com.wfxuni.pattern.composition;

import com.wfxuni.pattern.composition.service.EggLayable;
import com.wfxuni.pattern.composition.service.Flyable;
import com.wfxuni.pattern.composition.service.Tweetable;

/**
 * 麻雀
 */
public class Sparrow implements Flyable, Tweetable, EggLayable {


    //... 省略其他属性和方法...

    @Override
    public void fly() {
        //...
    }

    @Override
    public void tweet() {
        //...
    }

    @Override
    public void layEgg() {
        //...
    }
}
