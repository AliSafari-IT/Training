/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fact.it.www.beans;

/**
 *
 * @author Ali
 */
public class SportTasks {

    private int id;
    private String omschrijving;

    public SportTasks() {
    }

    public SportTasks(int id, String omschrijving) {
        this.id = id;
        this.omschrijving = omschrijving;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getOmschrijving() {
        return omschrijving;
    }

    public void setOmschrijving(String omschrijving) {
        this.omschrijving = omschrijving;
    }
}
