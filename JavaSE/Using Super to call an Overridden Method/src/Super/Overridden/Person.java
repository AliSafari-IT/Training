/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Super.Overridden;

/**
 *
 * @author Ali
 */
public class Person {

    private String name = null;

    public Person(String theName) {
        name = theName;
    }

    public String getFood() {
        return "Hamburger";
    }
}
