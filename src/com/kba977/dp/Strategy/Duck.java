package com.kba977.dp.Strategy;

import com.kba977.dp.Strategy.Behaviors.FlyBehavior;
import com.kba977.dp.Strategy.Behaviors.QuackBehavior;
import com.kba977.dp.Strategy.Behaviors.impl.FlyRocketPowered;

/**
 * Created by kba977 on 2017/6/2.
 */
public abstract class Duck {
    FlyBehavior flyBehavior;
    QuackBehavior quackBehavior;

    public Duck() {};

    public abstract void display();

    public void swim() {
        System.out.println("I'm swimming...");
    }

    public void performQuack() {
        if (quackBehavior != null) {
            quackBehavior.quack();
        }
    }

    public void performFly() {
        if (flyBehavior != null) {
            flyBehavior.fly();
        }
    }

    public void setFlyBehavior(FlyBehavior fb) {
        flyBehavior = fb;
    }

    public void setQuackBehavior(QuackBehavior qb) {
        quackBehavior = qb;
    }
}

