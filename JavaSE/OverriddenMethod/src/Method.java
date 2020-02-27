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
public class Method {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /** When the student getFood() method is executed it will start 
         * executing the getFood method in Student. When it gets to 
         * super.getFood() it will execute the getFood method in Person. 
         * This method will return the string "Hamburger". Then execution 
         * will continue in the getFood method of Student and it return 
         * the string "Hamburger and Taco".*/
        
        Student s = new Student("Ali");
        System.out.println(s.getFood());
        
        Base b = new Derived(); 
        b.methodOne();
    }
    
}
