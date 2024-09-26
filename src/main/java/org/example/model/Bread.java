package org.example.model;

public class Bread extends ProductForSale{
    private String color;

    public String getColor() {
        return color;
    }

    public Bread(String type, double price, String description) {
        super(type, price, description);
    }
    @Override
    public void showDetails() {
        System.out.println(getClass().getSimpleName() + "'s type: " + getType() + " price: " + getPrice() + " description " + getDescription() + " color " + getColor());
    }
}
