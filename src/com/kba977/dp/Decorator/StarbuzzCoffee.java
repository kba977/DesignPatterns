package com.kba977.dp.Decorator;

import com.kba977.dp.Decorator.component.Beverage;
import com.kba977.dp.Decorator.component.Beverage.Size;
import com.kba977.dp.Decorator.component.DarkRoast;
import com.kba977.dp.Decorator.component.Espresso;
import com.kba977.dp.Decorator.component.HouseBlend;
import com.kba977.dp.Decorator.decorator.Mocha;
import com.kba977.dp.Decorator.decorator.Soy;
import com.kba977.dp.Decorator.decorator.Whip;

/**
 * Created by kba977 on 2017/6/5.
 */

public class StarbuzzCoffee {
    public static void main(String args[]) {
        Beverage beverage = new Espresso();
        System.out.println(beverage.getDescription() + " $" + beverage.cost());

        Beverage beverage2 = new DarkRoast();
        beverage2 = new Mocha(beverage2);
        beverage2 = new Mocha(beverage2);
        beverage2 = new Whip(beverage2);
        System.out.println(beverage2.getDescription() + " $" + beverage2.cost());

        Beverage beverage3 = new HouseBlend();
        beverage3.setSize(Size.GRANDE);
        beverage3 = new Soy(beverage3);
        beverage3 = new Mocha(beverage3);
        beverage3 = new Whip(beverage3);
        System.out.println(beverage3.getDescription() + " $" + beverage3.cost());
    }
}
