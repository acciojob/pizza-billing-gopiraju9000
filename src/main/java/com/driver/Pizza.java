package com.driver;

public class Pizza {
    private String bill = "";
    private int totalBillAmount;
    private boolean isVeg;

    private int toppingsPrice;
    private int cheesePrice ;
    private boolean billGenerated = false;
    private boolean ExtraCheeseAdded = false;
    private boolean ExtraToppingsAdded = false;
    private boolean PaperBagAdded = false;
    private int paperBagPrice;

    public Pizza(Boolean isVeg) {
        this.isVeg = isVeg;
        // your code goes here

        if (isVeg) {
            this.totalBillAmount = this.totalBillAmount + 300;
            this.bill = this.bill + "Base Price Of The Pizza: 300" + "\n";
            this.toppingsPrice = 70;
        } else {
            this.totalBillAmount = this.totalBillAmount + 400;
            this.bill = bill + "Base Price Of The Pizza: 400"+"\n";
            this.toppingsPrice = 120;
        }
        this.cheesePrice = 80;
        this.paperBagPrice = 20;
    }

    public int getPrice() {

        return this.totalBillAmount;
    }

    public void addExtraCheese() {

        if (ExtraCheeseAdded == false) {
            totalBillAmount = totalBillAmount + cheesePrice;
            ExtraCheeseAdded = true;
        }
    }

    public void addExtraToppings() {

        // your code goes here
        if (ExtraToppingsAdded == false) {

            totalBillAmount = totalBillAmount + toppingsPrice;
            ExtraToppingsAdded = true;
        }
    }

    public void addTakeaway() {
        if (PaperBagAdded == false) {
            totalBillAmount = totalBillAmount + paperBagPrice;
            PaperBagAdded = true;
        }
    }

    public String getBill() {

        if (billGenerated == false) {

            if (ExtraCheeseAdded) bill = bill +"Extra Cheese Added: 80" + "\n";
            if (ExtraToppingsAdded) bill = bill +"Extra Toppings Added: " + toppingsPrice + "\n";
            if(PaperBagAdded) bill = bill + "Paperbag Added: "+paperBagPrice+"\n";
            bill = bill + "Total Price: " + totalBillAmount+"\n";
            billGenerated = true;

            return this.bill;
        }
       else return null;
    }
}
