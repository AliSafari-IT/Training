/** 
 * Toetsenbord (Keyboard) is a subclass of ComputerOnderdeel(ComputerPart)
 * 
 We don't mention the attributes mark, serial number and price anymore. 
 * We inherit these from the superclass.

 */
package fact.it.www.beans;

/**
 *
 * @author Ali
 */
public class Toetsenbord extends ComputerOnderdeel {

    private boolean draadloos;

    public Toetsenbord() {
    }

    public Toetsenbord(String merk, double prijs) {
        super(merk);  //verwijzing naar de constructor van ComputerOnderdeel
        this.prijs = prijs;
    }

    @Override
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
