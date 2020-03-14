package fact.it.www.dataaccess;

import fact.it.www.beans.SportTasks;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author Ali
 */
public class DATasks {

    private final String url, login, password;

    public DATasks(String url,
            String login,
            String password,
            String driver
    ) throws ClassNotFoundException {
        Class.forName(driver);
        this.url = url;
        this.login = login;
        this.password = password;
    }

    public SportTasks getTask() {
        SportTasks task = null;

        try (
                Connection connection = DriverManager.getConnection(url, login, password);
                PreparedStatement statement = connection.prepareStatement("SELECT * FROM sporttak WHERE id = ?");) {
            statement.setInt(1, 1);
            ResultSet resultSet = statement.executeQuery();
            if (resultSet.next()) {
                task = new SportTasks();
                task.setId(resultSet.getInt("id"));
                task.setOmschrijving(resultSet.getString("omschrijving"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return task;
    }

    public ArrayList<SportTasks> getTasks() {
        ArrayList<SportTasks> tasks = new ArrayList<>();
        SportTasks task = null;

        try (
                Connection connection = DriverManager.getConnection(url, login, password);
                PreparedStatement statement = connection.prepareStatement("SELECT * FROM sporttak order by Omschrijving");) {
            ResultSet resultSet = statement.executeQuery();
            while (resultSet.next()) {
                task = new SportTasks();
                task.setId(resultSet.getInt("id"));
                task.setOmschrijving(resultSet.getString("omschrijving"));
                tasks.add(task);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return tasks;
    }

    public SportTasks getTask(Integer taskID) {
        SportTasks task = null;

        try (
                Connection connection = DriverManager.getConnection(url, login, password);
                PreparedStatement statement = connection.prepareStatement("SELECT * FROM sporttak WHERE id = ?");) {
            statement.setInt(1, taskID);
            ResultSet resultSet = statement.executeQuery();
            if (resultSet.next()) {
                task = new SportTasks();
                task.setId(resultSet.getInt("id"));
                task.setOmschrijving(resultSet.getString("omschrijving"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return task;
    }

    public boolean updateTask(int taskID, String taskContent) {
        boolean updated = true;
        try (
                Connection connection = DriverManager.getConnection(url, login, password);
                PreparedStatement statement = connection.prepareStatement("UPDATE sporttak SET OMSCHRIJVING =? WHERE ID=?");) {
            statement.setString(1, taskContent);
            statement.setInt(2, taskID);
            statement.executeUpdate();
        } catch (Exception e) {
            updated = false;
            e.printStackTrace();
        }
        return updated;
    }

    public boolean addTask(String taskContent) {
 boolean updated = true;
        try (
                Connection connection = DriverManager.getConnection(url, login, password);
                PreparedStatement statement = connection.prepareStatement("INSERT into sporttak VALUES(Next Value For sporttak_seq, ?)");) {
            statement.setString(1, taskContent);
            statement.executeUpdate();
        } catch (Exception e) {
            updated = false;
            e.printStackTrace();
        }
        return updated;    }

}
