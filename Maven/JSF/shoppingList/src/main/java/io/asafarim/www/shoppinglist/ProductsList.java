/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package io.asafarim.www.shoppinglist;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import javax.annotation.PostConstruct;
import javax.enterprise.context.SessionScoped;
import javax.inject.Named;
import org.primefaces.model.chart.PieChartModel;

/**
 *
 * @author Ali
 */
@Named(value = "productsList")
@SessionScoped
public class ProductsList implements Serializable {

    private ArrayList<Product> productsListing;
    private PieChartModel pieModel2;

    /**
     * Creates a new instance of productsList
     */
    public ProductsList() {
    }

    public ArrayList<Product> getProductsListing() {
        return productsListing;
    }

    public void setProductsListing(ArrayList<Product> productsListing) {
        this.productsListing = productsListing;
    }

    @PostConstruct
    public void init() {
        productsListing = new ArrayList<>();
        Date date = new Date();
        Product p1 = new Product();
        p1.setProductName("Bacon Cheddar");
        p1.setPurchaseDate(date);
        p1.setPricePerUnit(5.2);
        p1.setVolume(3);
        productsListing.add(p1);
        Product p2 = new Product();
        p2.setProductName("Chocolate Cheese Fudge");
        p2.setPurchaseDate(date);
        p2.setPricePerUnit(12.49);
        p2.setVolume(2);
        productsListing.add(p2);
        Product p3 = new Product();
        p3.setProductName("Feta Crumbles");
        p3.setPurchaseDate(date);
        p3.setPricePerUnit(3.39);
        p3.setVolume(3);
        productsListing.add(p3);
        Product p4 = new Product();
        p4.setProductName("Mozzarella");
        p4.setPurchaseDate(date);
        p4.setPricePerUnit(5.99);
        p4.setVolume(5);
        productsListing.add(p4);
    }

    public void add(Product p) {
        productsListing.add(p);
    }

    public void delete(Product p) {
        productsListing.remove(p);
    }

    public PieChartModel getPieChartModel() {
        pieModel2 = new PieChartModel();

        int less = 0;
        int more = 0;

        for (Product p : productsListing) {
            if (p.getPricePerUnit() >= 5.0) {
                more++;
            } else {
                less++;
            }
        }

        pieModel2.set("Less than 5 EUR", less);
        pieModel2.set("More than 5 EUR", more);

        pieModel2.setTitle("Cheese Price List");
        pieModel2.setLegendPosition("ne");
        pieModel2.setFill(true);
        pieModel2.setShowDataLabels(true);
        pieModel2.setDiameter(200);
        pieModel2.setShadow(false);

        return pieModel2;
    }
}
