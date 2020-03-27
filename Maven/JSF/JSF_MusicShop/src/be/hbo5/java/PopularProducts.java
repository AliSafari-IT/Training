package be.hbo5.java;

import java.util.ArrayList;
import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
//import javax.faces.bean.ManagedBean;
//import javax.faces.bean.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

/**
 *
 * @author Michiel
 */
//@ManagedBean
@RequestScoped
@Named("popularProducts")
public class PopularProducts {
    
    @Inject
    private ProductService productService;

    private ArrayList<Product> products;

    @PostConstruct
    public void initialize() {
        products = productService.getPopularProducts();
    }

    public ArrayList<Product> getProducts() {
        return products;
    }

    public PopularProducts() {
    }       
}
