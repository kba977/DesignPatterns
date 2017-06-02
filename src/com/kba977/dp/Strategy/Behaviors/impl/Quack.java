package com.kba977.dp.Strategy.Behaviors.impl;

import com.kba977.dp.Strategy.Behaviors.QuackBehavior;

/**
 * Created by kba977 on 2017/6/2.
 */

public class Quack implements QuackBehavior {
    public void quack() {
        System.out.println("Quack");
    }
}
