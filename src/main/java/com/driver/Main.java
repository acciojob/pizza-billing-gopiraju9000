package com.driver;

public class Main {
  public static void main(String[] args) {
    Pizza dp = new Pizza(true);
    System.out.println(dp.getPrice());
    dp.addExtraToppings();
    dp.addExtraCheese();
    dp.addTakeaway();
    System.out.println(dp.getBill());

    Pizza p = new Pizza(false);
    p.addExtraCheese();
    p.addExtraToppings();
    p.addTakeaway();
    System.out.println(p.getBill());
  }
}