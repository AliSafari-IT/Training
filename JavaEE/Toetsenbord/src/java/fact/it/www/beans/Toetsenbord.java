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
public class Toetsenbord {

    private int serienummer;
    private String merk;
    private boolean draadloos;
    private double prijs;

    public Toetsenbord() {
        serienummer = 987450;
        merk = "?";
        draadloos = true;
    }

    public Toetsenbord(String merk, double prijs) {
        this.merk = merk;
        this.prijs = prijs;
    }

    public int getSerienummer() {
        return serienummer;
    }

    public String getMerk() {
        return merk;
    }

    public boolean isDraadloos() {
        return draadloos;
    }

    public double getPrijs() {
        return prijs;
    }

    public void setSerienummer(int serienummer) {
        this.serienummer = serienummer;
    }

    public void setMerk(String merk) {
        this.merk = merk;
    }

    public void setDraadloos(boolean draadloos) {
        this.draadloos = draadloos;
    }

    public void setPrijs(double prijs) {
        this.prijs = prijs;
    }
//extra methodes
    public double getPrijsDollar(double omreken) {
        return prijs * omreken;
    }

    public String toString() {
        return "Het toetsenbord met serienummer " + serienummer + " kost € " + prijs;
    }
}
