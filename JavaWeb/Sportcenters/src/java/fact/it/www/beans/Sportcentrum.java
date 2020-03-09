
package fact.it.www.beans;

public class Sportcentrum {

    private int id;
    private String centrumnaam;
    private String straat;
    private String huisnummer;
    private int postcode ;
    private String woonplaats;
    private String telefoon;
    
    
    public Sportcentrum() {
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getCentrumnaam() {
        return centrumnaam;
    }
    public void setCentrumnaam(String centrumnaam) {
        this.centrumnaam = centrumnaam;
    }
    public String getStraat() {
        return straat;
    }

    public void setStraat(String straat) {
        this.straat = straat;
    }

    public String getHuisnummer() {
        return huisnummer;
    }

    public void setHuisnummer(String huisnummer) {
        this.huisnummer = huisnummer;
    }

    public int getPostcode() {
        return postcode;
    }

    public void setPostcode(int postcode) {
        this.postcode = postcode;
    }

    public String getWoonplaats() {
        return woonplaats;
    }

    public void setWoonplaats(String woonplaats) {
        this.woonplaats = woonplaats;
    }

    public String getTelefoon() {
        return telefoon;
    }

    public void setTelefoon(String telefoon) {
        this.telefoon = telefoon;
    }
  
}
