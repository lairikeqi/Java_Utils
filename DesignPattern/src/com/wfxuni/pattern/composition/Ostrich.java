package com.wfxuni.pattern.composition;

import com.wfxuni.pattern.composition.service.EggLayable;
import com.wfxuni.pattern.composition.service.Tweetable;
import com.wfxuni.pattern.composition.service.impl.EggLayAbility;
import com.wfxuni.pattern.composition.service.impl.TweetAbility;

/**
 * 鸵鸟
 */
public class Ostrich implements Tweetable, EggLayable {

    // 组合  TweetAbility是Tweetable接口的实现类
    private TweetAbility tweetAbility = new TweetAbility();

    // 组合  EggLayAbility是EggLayable接口的实现类
    private EggLayAbility eggLayAbility = new EggLayAbility();

    //... 省略其他属性和方法...

    @Override
    public void tweet() {
        tweetAbility.tweet();
    }

    @Override
    public void layEgg() {
        eggLayAbility.layEgg();
    }
}

