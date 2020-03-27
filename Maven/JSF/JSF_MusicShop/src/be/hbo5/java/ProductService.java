/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package be.hbo5.java;

import java.util.ArrayList;

/**
 *
 * @author Michiel
 */
public interface ProductService {
    ArrayList<Product> getPopularProducts();

    Product getProduct(long id);
}
