package org.example.model;

public class Chocolate extends ProductForSale{

    private String  shape;
    public Chocolate(String type, double price, String description) {
        super(type, price, description);
    }

    public String getShape() {
        return shape;
    }

    @Override
    public void showDetails() {
        System.out.println(getClass().getSimpleName() + "'s type: " + getType() + " price: " + getPrice() + " description " + getDescription() + " shape " + getShape());
    }
}
