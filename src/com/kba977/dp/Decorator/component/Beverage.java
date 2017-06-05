package com.kba977.dp.Decorator.component;

/**
 * Created by kba977 on 2017/6/5.
 */
public abstract class Beverage {
    public enum Size { TALL, GRANDE, VENTI };
    String description = "Unknown Beverage";
    Size size = Size.TALL;


    public String getDescription() {
        return this.description;
    }

    public Size getSize() {
        return this.size;
    }

    public void setSize(Size size) {
        this.size = size;
    }

    public abstract double cost();
}
