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
