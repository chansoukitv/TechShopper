package com.silver.dan.deals;

/**
 * Created by dan on 9/26/15.
 */
public class Listing {
    public double price;
    public String url;
    public String store;
    public boolean freeShipping;
    public double average_review;
    public int number_of_reviews;
    public boolean hasReviewData;
    private int id;

    Listing(int id, double price, String url, String store, boolean freeShipping) {
        hasReviewData = false; //default to no review data
        this.price = price;
        this.url = url;
        this.store = store;
        this.freeShipping = freeShipping;
        this.id = id;
    }

    public String getPriceString() {
        return "$" + String.format( "%.2f", price);
    }
}
