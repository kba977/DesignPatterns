package com.kba977.dp.Decorator.component;

/**
 * Created by kba977 on 2017/6/5.
 */
public class HouseBlend extends Beverage {
    public HouseBlend() {
        this.description = "House Blend Coffee";
    }

    public double cost() {
        return .89;
    }
}
