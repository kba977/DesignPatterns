package com.kba977.dp.Strategy.Behaviors.impl;

import com.kba977.dp.Strategy.Behaviors.FlyBehavior;

/**
 * Created by kba977 on 2017/6/2.
 */

public class FlyRocketPowered implements FlyBehavior {
    public void fly() {
        System.out.println("I'm flying with a rocket!");
    }
}
