package com.kba977.dp.Decorator.component;

/**
 * Created by kba977 on 2017/6/5.
 */

public class Decaf extends Beverage {
    public Decaf() {
        this.description = "Espresso";
    }

    public double cost() {
        return 1.05;
    }
}