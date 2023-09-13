package com.driver;

public class Pizza {

    private int price;
    private Boolean isVeg;
    private String bill;
    public int extraToppings;
    public int extraCheese = 80;
    public Pizza(Boolean isVeg){
        this.isVeg = isVeg;
        // your code goes here
        if(isVeg){
            price = price + 300;//add the pizza pric
            extraToppings = 70;
            bill += "Base Price of The Pizza = 300 " + "\n";
        }
        else{
            extraToppings = 120;
            price = price + 400;
            bill = bill + "Base price of The Pizza = 400  " + "\n";
        }
    }

    public int getPrice(){

        return this.price;
    }

    public void addExtraCheese(){

        // your code goes here
        price = price + extraCheese;
        bill = bill + "Extra cheese price = "+extraCheese + "\n";

    }

    public void addExtraToppings(){

        // your code goes here

        if(isVeg) {
            bill = bill + "Extra Toppings Added = 70"+ "\n";
            price = price + extraToppings;
        }
        else{
            bill = bill + "Extra Toppings Added = 120" + "\n";
            price = price + extraToppings;
        }
    }

    public void addTakeaway(){
        // your code goes here
        price = price + 20;
        bill = bill + "Paperbag Added = 20"+"\n";
    }

    public String getBill(){
        // your code goes here
        bill = bill + "Total Price : "+price + "\n";
        return this.bill;
    }
}
