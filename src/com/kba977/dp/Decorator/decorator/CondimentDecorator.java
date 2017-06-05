package com.kba977.dp.Decorator.decorator;

import com.kba977.dp.Decorator.component.Beverage;

/**
 * Created by kba977 on 2017/6/5.
 */
public abstract class CondimentDecorator extends Beverage {
    public abstract String getDescription();
}
