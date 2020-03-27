package exercise1;

/**
 *
 * @author Ali
 */
import javax.enterprise.context.Dependent;
import javax.inject.Named;

@Dependent
@Named
public class MessageServerBean {

    public String getMessage() {
        String str = "Hello World! Note that the bean is just a POJO (Plain Old Java Object).";
        return str;
    }
}
