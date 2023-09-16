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

    Pizza dp1 = new Pizza(false);
    dp1.addExtraToppings();
    dp1.addExtraCheese();
    dp1.addTakeaway();
    System.out.println(dp1.getBill());

    Pizza dp2 = new Pizza(false);
    dp2.addExtraToppings();
    dp2.addExtraCheese();
    dp2.addTakeaway();
    System.out.println(dp2.getBill());


    Pizza q = new Pizza(true);
    q.addExtraCheese();
    q.addExtraToppings();
    q.addTakeaway();
    System.out.println(q.getBill());


  }
}