package com.pluralsight;

public class Receipt {
    public static void main(String[] args) {
        String itemName = "Banana";
        double itemPrice = 2.36;
        int quantity = 3;
        double totalPrice = itemPrice * quantity;
        System.out.println("you bought " + quantity + " " + itemName + " for $" + totalPrice);
    }

}
