package fact.it.www.beans;

import java.sql.Date;

public class SportCamp{
    private int id;
    private int centrum_id;
    private Sportcentrum sportcentrum;
    private String kampnaam;
    private Date begindatum;
    private Date einddatum;
    private int sporttak_id;
    private SportTasks sportTasks;
    private int min_gebjaar;
    private int max_gebjaar;
    private double prijs;
    private int aantal_plaatsen;

    public Sportcentrum getSportcentrum() {
        return sportcentrum;
    }

    public void setSportcentrum(Sportcentrum sportcentrum) {
        this.sportcentrum = sportcentrum;
    }

    public SportTasks getSportTasks() {
        return sportTasks;
    }

    public void setSportTasks(SportTasks sportTasks) {
        this.sportTasks = sportTasks;
    }
    
    public SportCamp() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCentrum_id() {
        return centrum_id;
    }

    public void setCentrum_id(int centrum_id) {
        this.centrum_id = centrum_id;
    }

    public String getKampnaam() {
        return kampnaam;
    }

    public void setKampnaam(String kampnaam) {
        this.kampnaam = kampnaam;
    }

    public Date getBegindatum() {
        return begindatum;
    }

    public void setBegindatum(Date begindatum) {
        this.begindatum = begindatum;
    }

    public Date getEinddatum() {
        return einddatum;
    }

    public void setEinddatum(Date einddatum) {
        this.einddatum = einddatum;
    }

    public int getSporttak_id() {
        return sporttak_id;
    }

    public void setSporttak_id(int sporttak_id) {
        this.sporttak_id = sporttak_id;
    }

    public int getMin_gebjaar() {
        return min_gebjaar;
    }

    public void setMin_gebjaar(int min_gebjaar) {
        this.min_gebjaar = min_gebjaar;
    }

    public int getMax_gebjaar() {
        return max_gebjaar;
    }

    public void setMax_gebjaar(int max_gebjaar) {
        this.max_gebjaar = max_gebjaar;
    }

    public double getPrijs() {
        return prijs;
    }

    public void setPrijs(double prijs) {
        this.prijs = prijs;
    }

    public int getAantal_plaatsen() {
        return aantal_plaatsen;
    }

    public void setAantal_plaatsen(int aantal_plaatsen) {
        this.aantal_plaatsen = aantal_plaatsen;
    }

  
}
