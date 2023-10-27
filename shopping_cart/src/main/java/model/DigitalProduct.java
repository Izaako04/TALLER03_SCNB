/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import interfaces.Shoppable;

/**
 *
 * @author CltControl
 */
public class DigitalProduct extends Product implements Shoppable{
    
    public DigitalProduct(String name, double price) {
        super(name, price);
    }

    @Override
    public double calculateIva() {
        return (super.price)*(0.15);
    }
}
