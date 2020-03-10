package fact.it.www.dataaccess;

import fact.it.www.beans.Members;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

/**
 *
 * @author Ali
 */
public class DAMembers {

    private final String url, login, password;

    // Constructor met 4 parameters
    public DAMembers(
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

    public Members getMember(String partName) {
        Members member = null;

        try (
                Connection connection = DriverManager.getConnection(url, login, password);
                PreparedStatement statement = connection.prepareStatement("SELECT * FROM deelnemer WHERE deelnemernaam like ?");) {
            statement.setString(1, "%" + partName + "%");
            ResultSet resultSet = statement.executeQuery();
            if (resultSet.next()) {
                member = new Members();
                member.setId(resultSet.getInt("id"));
                member.setDeelnemernaam(resultSet.getString("deelnemernaam"));
                member.setVoornaam(resultSet.getString("voornaam"));
                member.setGeboortedatum(resultSet.getDate("geboortedatum"));
                member.setGeslacht(resultSet.getString("geslacht"));
                member.setStraat(resultSet.getString("straat"));
                member.setHuisnummer(resultSet.getString("huisnummer"));
                member.setBus(resultSet.getInt("bus"));
                member.setPostcode(resultSet.getInt("postcode"));
                member.setWoonplaats(resultSet.getString("woonplaats"));
                member.setTelefoon(resultSet.getString("telefoon"));
                member.setGsm(resultSet.getString("gsm"));
                member.setEmail(resultSet.getString("email"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return member;
    }

    public ArrayList<Members> getMembers(String searchString) {
        Members member;
        ArrayList<Members> membersList = new ArrayList<>();
        try (
                Connection connection = DriverManager.getConnection(url, login, password);
                PreparedStatement statement = connection.prepareStatement("SELECT * FROM deelnemer WHERE Lower(deelnemernaam) like ?");) {
            statement.setString(1, "%" + searchString + "%");
            ResultSet resultSet = statement.executeQuery();
            while (resultSet.next()) {
                member = new Members();
                member.setId(resultSet.getInt("id"));
                member.setDeelnemernaam(resultSet.getString("deelnemernaam"));
                member.setVoornaam(resultSet.getString("voornaam"));
                member.setGeboortedatum(resultSet.getDate("geboortedatum"));
                member.setGeslacht(resultSet.getString("geslacht"));
                member.setStraat(resultSet.getString("straat"));
                member.setHuisnummer(resultSet.getString("huisnummer"));
                member.setBus(resultSet.getInt("bus"));
                member.setPostcode(resultSet.getInt("postcode"));
                member.setWoonplaats(resultSet.getString("woonplaats"));
                member.setTelefoon(resultSet.getString("telefoon"));
                member.setGsm(resultSet.getString("gsm"));
                member.setEmail(resultSet.getString("email"));
                membersList.add(member);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return membersList;
    }

    public Members getMember(Integer memberID) {
        Members member = null;

        try (
                Connection connection = DriverManager.getConnection(url, login, password);
                PreparedStatement statement = connection.prepareStatement("SELECT * FROM deelnemer WHERE id=?");) {
            statement.setInt(1, memberID);
            ResultSet resultSet = statement.executeQuery();
            if (resultSet.next()) {
                member = new Members();
                member.setId(resultSet.getInt("id"));
                member.setDeelnemernaam(resultSet.getString("deelnemernaam"));
                member.setVoornaam(resultSet.getString("voornaam"));
                member.setGeboortedatum(resultSet.getDate("geboortedatum"));
                member.setGeslacht(resultSet.getString("geslacht"));
                member.setStraat(resultSet.getString("straat"));
                member.setHuisnummer(resultSet.getString("huisnummer"));
                member.setBus(resultSet.getInt("bus"));
                member.setPostcode(resultSet.getInt("postcode"));
                member.setWoonplaats(resultSet.getString("woonplaats"));
                member.setTelefoon(resultSet.getString("telefoon"));
                member.setGsm(resultSet.getString("gsm"));
                member.setEmail(resultSet.getString("email"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return member;
    }
}
