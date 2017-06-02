package com.kba977.dp.Strategy;

import com.kba977.dp.Strategy.Behaviors.impl.FlyRocketPowered;

/**
 * Created by kba977 on 2017/6/2.
 */

public class StrategyPatternTest {
    public static void main(String[] args) {
        Duck mallard = new MallardDuck();
        mallard.performQuack();
        mallard.performFly();
        mallard.swim();

        System.out.println();

        Duck modelDuck = new ModelDuck();
        modelDuck.performFly();
        modelDuck.setFlyBehavior(new FlyRocketPowered());
        modelDuck.performFly();
    }
}
