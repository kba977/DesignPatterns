package com.kba977.dp.Factory.factory;

import com.kba977.dp.Factory.product.*;

/**
 * Created by kba977 on 2017/6/6.
 */
public class NYPizzaStore extends PizzaStore {

    Pizza createPizza(String item) {
        if (item.equals("cheese")) {
            return new NYStyleCheesePizza();
        } else if (item.equals("clam")) {
            return new NYStyleClamPizza();
        } else return null;
    }
}
