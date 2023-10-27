package model;

import interfaces.Shoppable;

public class DigitalProduct extends Product implements Shoppable{
    
    public DigitalProduct(String name, double price) {
        super(name, price);
    }

    @Override
    public double calculateIva() {
        return (super.price)*(0.15);
    }
}
