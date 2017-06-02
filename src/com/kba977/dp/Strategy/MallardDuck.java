package com.kba977.dp.Strategy;

import com.kba977.dp.Strategy.Behaviors.impl.FlyWithWings;
import com.kba977.dp.Strategy.Behaviors.impl.Quack;

/**
 * Created by kba977 on 2017/6/2.
 */

public class MallardDuck extends Duck {

    public MallardDuck() {
        quackBehavior = new Quack();
        flyBehavior = new FlyWithWings();
    }

    public void display() {
        System.out.println("I'm a real Mallard duck");
    }
}
