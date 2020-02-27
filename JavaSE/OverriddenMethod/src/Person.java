/** Using Super to call an Overridden Method
Sometimes you want the child class to do more than what a parent method is doing. 
You want to still execute the parent method, but then do also do something else. 
* But, since you have overridden the parent method how can you still call it? 
* You can use super.method() to force the parent’s method to be called.
 */


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
