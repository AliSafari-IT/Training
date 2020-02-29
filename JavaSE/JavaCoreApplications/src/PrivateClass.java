/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ali
 */
public class PrivateClass {

    int internalProperty = 0; // automatically assigned package-private by default
    protected boolean defaultProperty  = true; // automatically assigned package-private
    public boolean publicProperty = true; // automatically converted to package-private
    private String fileprivateProperty = "Hello!"; //only available to the class

    private static void privateMethod() {
    }
}
