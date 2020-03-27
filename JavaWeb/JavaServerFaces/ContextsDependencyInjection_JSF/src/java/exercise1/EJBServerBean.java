package exercise1;

import javax.ejb.Stateless;
import javax.enterprise.context.Dependent;
import javax.inject.Named;

/**
 *
 * @author Ali
 */
@Dependent
@Named
@Stateless
public class EJBServerBean {

    public String getMessage() {
        return "Hello EJB!";
    }
}
