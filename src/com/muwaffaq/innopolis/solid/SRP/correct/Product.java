package com.muwaffaq.innopolis.solid.SRP.correct;

public class Product {
    double totals;

    void applyDiscount(int percentage) {
        totals = totals * percentage;
    }
}
