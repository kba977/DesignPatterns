package com.kba977.dp.Strategy;

import com.kba977.dp.Strategy.Behaviors.impl.FlyNoWay;
import com.kba977.dp.Strategy.Behaviors.impl.Quack;

/**
 * Created by kba977 on 2017/6/2.
 */

public class ModelDuck extends Duck {

    public ModelDuck() {
        quackBehavior = new Quack();
        flyBehavior = new FlyNoWay();
    }

    public void display() {
        System.out.println("I'm a model Duck");
    }
}
