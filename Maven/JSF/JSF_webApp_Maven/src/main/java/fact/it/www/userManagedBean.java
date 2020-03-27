package fact.it.www;

import javax.inject.Named;
import javax.enterprise.context.Dependent;

/**
 *
 * @author Ali
 */
@Named(value = "userManagedBean")
@Dependent

public class userManagedBean {

    private String username= "";

    /**
     * Creates a new instance of userManagedBean
     */
    public userManagedBean() {
        this.username = username.trim();
    }

    public String getUsername() {
        return username.trim();
    }

    public void setUsername(String username) {
        this.username = username.trim();
    }

    public String welcomeUser() {
        setUsername(username);
        return "welcomePage";
    }
}
