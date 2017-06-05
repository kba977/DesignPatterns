package com.kba977.dp.Decorator.decorator;

import com.kba977.dp.Decorator.component.Beverage;

/**
 * Created by kba977 on 2017/6/5.
 */

public class Whip extends CondimentDecorator {
    Beverage beverage;

    public Whip(Beverage beverage) {
        this.beverage = beverage;
    }


    public String getDescription() {
        return beverage.getDescription() + ", Whip";
    }

    public double cost() {
        return .10 + beverage.cost();
    }
}
