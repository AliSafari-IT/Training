
package fact.it.www.dataaccess;

import fact.it.www.beans.Sportcentrum;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class DASportcentrum {

     private final String url, login, password;

    // Constructor met 4 parameters
    public DASportcentrum(
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

    public Sportcentrum getSportcentrum() {
        Sportcentrum sportcentrum = null;

        try (
             Connection connection = DriverManager.getConnection(url, login, password);
             Statement statement = connection.createStatement();
             ResultSet resultSet = 
                     statement.executeQuery(
                             "SELECT * FROM sportcentrum where id = 1"
                     );) {
            if (resultSet.next()) {
                sportcentrum = new Sportcentrum();
                sportcentrum.setId(resultSet.getInt("id"));
                sportcentrum.setCentrumnaam(resultSet.getString("centrumnaam"));
                sportcentrum.setStraat(resultSet.getString("straat"));
                sportcentrum.setHuisnummer(resultSet.getString("huisnummer"));
                sportcentrum.setPostcode(resultSet.getInt("postcode"));
                sportcentrum.setWoonplaats(resultSet.getString("woonplaats"));
                sportcentrum.setTelefoon(resultSet.getString("telefoon"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return sportcentrum;
    }
}
