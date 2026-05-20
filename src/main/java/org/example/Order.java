package org.example;

public class Order {

    String companyName;
    String productOrdered;
    Integer numberOfProductsOrdered;

    public Order(String companyName, String productOrdered, Integer numberOfProductsOrdered) {
        this.companyName = companyName;
        this.productOrdered = productOrdered;
        this.numberOfProductsOrdered = numberOfProductsOrdered;
    }

    @Override
    public String toString() {
        return "Order for company \"" + companyName + "\": " + numberOfProductsOrdered + "x " + productOrdered;
    }

    public String getCompanyName() {
        return companyName;
    }

    public Integer getNumberOfProductsOrdered() {
        return numberOfProductsOrdered;
    }

    public String getProductOrdered() {
        return productOrdered;
    }
}