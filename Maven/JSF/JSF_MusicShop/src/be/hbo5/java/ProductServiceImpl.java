/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package be.hbo5.java;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.enterprise.context.ApplicationScoped;
//import javax.faces.bean.ApplicationScoped;

/**
 *
 * @author Michiel
 */
@ApplicationScoped
public class ProductServiceImpl implements ProductService {

    private final Map<Long, Product> products;

    private final ArrayList<Product> popularProducts;

    public ProductServiceImpl() {
        Map<Long, Product> map = new HashMap<>();
        map.put(1L, new Product(1L, "Microphone", "Essential for every vocalist - this microphone makes your voice sound great. Suitable for any kind of music and any voice.", 95.00, "microphone"));
        map.put(2L, new Product(2L, "Guitar", "This guitar sounds great and looks cool. Rock, blues or jazz, this guitar does it all.", 995.00, "guitar"));
        map.put(3L, new Product(3L, "Saxophone", "Steal the show with this cool saxophone. Suitable for beginners as well as for advanced players.", 1195.00, "saxophone"));
        map.put(4L, new Product(4L, "Bass Guitar", "Every band needs a solid bass guitar. This one will never let you down.", 895.00, "bassguitar"));
        map.put(5L, new Product(5L, "Drum Kit", "This complete drum kit provides everything a drummer needs. Including an extra pair of sticks.", 1249.00, "drumkit"));

        products = Collections.unmodifiableMap(map);
        popularProducts = new ArrayList<>(products.values());
    }

    @Override
    public ArrayList<Product> getPopularProducts() {
        return popularProducts;
    }

    @Override
    public Product getProduct(long id) {
        return products.get(id);
    }
}
