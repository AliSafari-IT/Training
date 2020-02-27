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
public class Student extends Person {

    private int id;
    private static int nextId = 0;

    public Student(String theName) {
        super(theName);
        id = nextId;
        nextId++;
    }

    @Override
    public String getFood() {
        String output = super.getFood();
        return output + " and Taco";
    }

    public int getId() {
        return id;
    }

    public void setId(int theId) {
        this.id = theId;
    }
}
