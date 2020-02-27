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
public class ComputerOnderdeel {
     protected int serienummer;    
    protected String merk;
    protected double prijs; 
   
    public ComputerOnderdeel() {	//no-arg constructor
        merk = "onbekend"; 
        serienummer = 999999;
    }

public ComputerOnderdeel (String merk) {	//constructor met 1 parameter
       this.merk = merk;
}
public String getMerk() {
        return merk;
    }

    public void setMerk(String merk) {
        this.merk = merk;
    }
    
    public int getSerienummer() {
        return serienummer;
    }

    public void setSerienummer(int serienummer) {
        this.serienummer = serienummer;
    }
    public double getPrijs() {
        return prijs;
    }
    public void setPrijs(double prijs) {
        this.prijs = prijs;
    }
    public double getPrijsDollar(double omreken)  {
    	return prijs * omreken;
    }
	@Override
 	public String toString(){
   	return merk + " serienr: " + serienummer + " prijs: € "+ prijs;
   }
}
