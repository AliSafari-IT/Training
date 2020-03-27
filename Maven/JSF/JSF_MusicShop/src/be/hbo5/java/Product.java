/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package be.hbo5.java;


/**
 *
 * @author Michiel
 */
public class Product {
    private long id;
    private String name;
    private String description;
    private double price;
    private String imageName;

    public Product(long id, String name, String description, double price, String imageName) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.price = price;
        this.imageName = imageName;
    }
    
    public Product() {}

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public String getShortDescription() {
        int i = description.indexOf('.');
        if (i >= 0 && i < 100) {
            return description.substring(0, i + 1);
        } else {
            return description.substring(0, Math.min(description.length(), 100)) + "...";
        }
    }

    public double getPrice() {
        return price;
    }

    public String getImageName() {
        return imageName;
    }
}
