package fact.it.www.dataaccess;

import fact.it.www.beans.SportCamp;
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
             ResultSet resultSet = 
                     statement.executeQuery(
                             "SELECT * FROM kamp where id = 1"
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
            }
        } catch (Exception e) {
            e.printStackTrace();

        }
        return kamp;
    }
}
