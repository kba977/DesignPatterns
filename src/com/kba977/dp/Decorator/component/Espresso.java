package com.kba977.dp.Decorator.component;

/**
 * Created by kba977 on 2017/6/5.
 */

public class Espresso extends Beverage {
    public Espresso() {
        this.description = "Espresso";
    }

    public double cost() {
        return 1.99;
    }
}
