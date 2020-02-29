/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ali
 */
public class App {

    public static void main(String[] args) {
        Unicorn unicorn = new Unicorn();
        System.out.println(unicorn.power); // Ok
        unicorn.height = 180; // Error
        unicorn.sleep(); // Error
        unicorn.run(); // Ok
    }
}
