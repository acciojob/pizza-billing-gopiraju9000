package com.driver;

public class DeluxePizza extends Pizza {

    public DeluxePizza(Boolean isVeg) {
        super(isVeg);
        // your code goes here
        extraCheese = 0;
        extraToppings = 0;
        addTakeaway();
        addExtraToppings();
        addExtraCheese();


    }
}
