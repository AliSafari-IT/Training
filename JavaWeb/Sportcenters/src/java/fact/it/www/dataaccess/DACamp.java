package fact.it.www.dataaccess;

import fact.it.www.beans.SportCamp;
import fact.it.www.beans.SportTasks;
import fact.it.www.beans.Sportcentrum;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class DACamp {

    private final String url, login, password;

    // Constructor met 4 parameters
    public DACamp(
            String url,
            String login,
            String password,
            String driver
    ) throws ClassNotFoundException {
        Class.forName(driver);
        this.url = url;
        this.login = login;
        this.password = password;
    }

    public SportCamp getCamp() {
        SportCamp kamp = null;

        try (
                Connection connection = DriverManager.getConnection(url, login, password);
                Statement statement = connection.createStatement();
                ResultSet resultSet
                = statement.executeQuery(
                        "SELECT * FROM kamp INNER JOIN sportcentrum ON kamp.centrum_id = sportcentrum.id INNER JOIN sporttak ON kamp.sporttak_id = sporttak.id WHERE kamp.id = 1"
                );) {
            if (resultSet.next()) {
                kamp = new SportCamp();
                kamp.setId(resultSet.getInt("id"));
                kamp.setCentrum_id(resultSet.getInt("centrum_id"));
                kamp.setKampnaam(resultSet.getString("kampnaam"));
                kamp.setBegindatum(resultSet.getDate("begindatum"));
                kamp.setEinddatum(resultSet.getDate("einddatum"));
                kamp.setSporttak_id(resultSet.getInt("sporttak_id"));
                kamp.setMin_gebjaar(resultSet.getInt("min_gebjaar"));
                kamp.setMax_gebjaar(resultSet.getInt("max_gebjaar"));
                kamp.setPrijs(resultSet.getDouble("prijs"));
                kamp.setAantal_plaatsen(resultSet.getInt("aantal_plaatsen"));
                //create related sport tasks!
                SportTasks sportTasks = new SportTasks();
                sportTasks.setId(resultSet.getInt("sporttak_id"));
                sportTasks.setOmschrijving(resultSet.getString("omschrijving"));
                kamp.setSportTasks(sportTasks);
                //create related sport tasks!
                Sportcentrum sportcentrum = new Sportcentrum();
                sportcentrum.setId(resultSet.getInt("centrum_id"));
                sportcentrum.setCentrumnaam(resultSet.getString("centrumnaam"));
                sportcentrum.setStraat(resultSet.getString("straat"));
                sportcentrum.setHuisnummer(resultSet.getString("huisnummer"));
                sportcentrum.setPostcode(resultSet.getInt("postcode"));
                sportcentrum.setWoonplaats(resultSet.getString("woonplaats"));
                sportcentrum.setTelefoon(resultSet.getString("telefoon"));
                kamp.setSportcentrum(sportcentrum);

            }
        } catch (Exception e) {
            e.printStackTrace();

        }
        return kamp;
    }
}
