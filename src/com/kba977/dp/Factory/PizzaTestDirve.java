package com.kba977.dp.Factory;

import com.kba977.dp.Factory.factory.ChicagoPizzaStore;
import com.kba977.dp.Factory.factory.NYPizzaStore;
import com.kba977.dp.Factory.factory.PizzaStore;

import com.kba977.dp.Factory.product.*;

/**
 * Created by kba977 on 2017/6/6.
 */
public class PizzaTestDirve {
    public static void main(String[] args) {
        PizzaStore nyStore = new NYPizzaStore();
        PizzaStore chicagoStore = new ChicagoPizzaStore();

        Pizza pizza = nyStore.orderPizza("cheese");
        System.out.println("二狗子定了一个 " + pizza.getName() + "\n");

        pizza = chicagoStore.orderPizza("cheese");
        System.out.println("隔壁老王定了一个 " + pizza.getName() + "\n");
    }
}
