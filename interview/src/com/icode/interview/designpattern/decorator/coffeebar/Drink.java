package com.icode.interview.designpattern.decorator.coffeebar;

/**
 * @author Unicorn
 * @create 2019-09-30 16:20
 */
public abstract class Drink {
    public String description = "";
    private float price = 0f;

    public String getDescription() {
        return description + "-" + this.price;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public abstract float cost();
}
