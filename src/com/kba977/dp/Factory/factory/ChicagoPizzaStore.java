package com.kba977.dp.Factory.factory;

import com.kba977.dp.Factory.product.*;

/**
 * Created by kba977 on 2017/6/6.
 */

public class ChicagoPizzaStore extends PizzaStore {
    Pizza createPizza(String item) {
        if (item.equals("cheese")) {
            return new ChicagoStyleCheesePizza();

        } else if (item.equals("clam")) {
            return new ChicagoStyleClamPizza();

        } else return null;
    }
}
