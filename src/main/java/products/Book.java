/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package products;

import ec.edu.espol.taller03.Product;
import interfaces.Shoppable;

/**
 *
 * @author CltControl
 */
public class Book extends Product implements Shoppable {

    public Book(String name, double price, double weight, String type) {
        super(name, price, weight, type);
    }

    @Override
    public double calculateIva() {
        return super.price;
    }
    
}
