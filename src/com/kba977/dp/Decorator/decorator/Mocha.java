package com.kba977.dp.Decorator.decorator;

import com.kba977.dp.Decorator.component.Beverage;

/**
 * Created by kba977 on 2017/6/5.
 */

public class Mocha extends CondimentDecorator {
    Beverage beverage;

    public Mocha(Beverage beverage) {
        this.beverage = beverage;
    }

    public String getDescription() {
        return beverage.getDescription() + ", Mocha";
    }

    public double cost() {
        return .20 + beverage.cost();
    }
}
