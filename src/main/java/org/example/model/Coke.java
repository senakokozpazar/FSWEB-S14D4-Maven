package org.example.model;

public class Coke extends ProductForSale{
    private int ml;
    public Coke(String type, double price, String description) {
        super(type, price, description);
    }

    public int getMl() {
        return ml;
    }

    @Override
    public void showDetails() {
        System.out.println(getClass().getSimpleName() + "'s type: " + getType() + " price: " + getPrice() + " description " + getDescription() + " ml " + getMl());
    }
}
