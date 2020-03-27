package fact.it.www.beans;

import java.io.Serializable;
import javax.faces.view.ViewScoped;
import javax.inject.Named;

/**
 *
 * @author Ali
 */
@ViewScoped
@Named("spinnerBean")
public class SpinnerBean implements Serializable{
    private int number;

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }
    
}
