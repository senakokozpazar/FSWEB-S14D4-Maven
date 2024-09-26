package org.example.model;

public class Store {
    public static void main(String[] args) {

        ProductForSale[] products = {
                new Chocolate("Bitter", 9.99, "80% cacao"),
                new Coke("Sugar-free", 8.99, "Diet"),
                new Bread("White", 5.99 ,"High-calorie")
        };

        listProducts(products);
    }

    public static void listProducts(ProductForSale[] products) {
        for(ProductForSale product : products){
            product.showDetails();
        }
    }
}