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
public class Book extends Product implements Shoppable {

    public Book(String name, double price) {
        super(name, price);
    }

    @Override
    public double calculateIva() {
        return 0;
    }
    
}
