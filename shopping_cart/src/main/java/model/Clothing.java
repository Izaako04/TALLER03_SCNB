package model;

import interfaces.Shoppable;

public class Clothing extends Product implements Shoppable{

    public Clothing(String name, double price) {
        super(name, price);
    }
    
    @Override
    public double calculateIva() {
       return (super.price)*(0.12);
    }
        
}
