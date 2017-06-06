package com.kba977.dp.Factory.factory;

import com.kba977.dp.Factory.product.*;

/**
 * Created by kba977 on 2017/6/6.
 */

public abstract class PizzaStore {


    public Pizza orderPizza(String type) {

        Pizza pizza = createPizza(type);

        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();

        return pizza;
    }

    abstract Pizza createPizza(String type);
}
