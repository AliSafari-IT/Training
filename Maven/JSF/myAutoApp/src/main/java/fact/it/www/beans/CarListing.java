package fact.it.www.beans;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import javax.annotation.PostConstruct;
import javax.enterprise.context.SessionScoped;
import javax.inject.Named;
import org.primefaces.model.chart.PieChartModel;

/**
 *
 * @author Ali
 */
@SessionScoped
@Named("carlisting")
public class CarListing implements Serializable {

    private ArrayList<Car> carList;
    private PieChartModel pieModel2;

    public CarListing() {
    }

    public ArrayList<Car> getCarList() {
        return carList;
    }

    public void setCarList(ArrayList<Car> carList) {
        this.carList = carList;
    }

    @PostConstruct
    public void init() {
        carList = new ArrayList<>();
        Date date = new Date();
        Car car1 = new Car();
        car1.setName("Ford Focus");
        car1.setRegistrationDate(date);
        car1.setMilage(15000.25);
        carList.add(car1);
        Car car2 = new Car();
        car2.setName("Ford Fiesta");
        car2.setRegistrationDate(date);
        car2.setMilage(150.25);
        carList.add(car2);
        Car car3 = new Car();
        car3.setName("Dacia Sandero");
        car3.setRegistrationDate(date);
        car3.setMilage(25000.25);
        carList.add(car3);
        Car car4 = new Car();
        car4.setName("BMW");
        car4.setRegistrationDate(date);
        car4.setMilage(125050.0);
        carList.add(car4);
    }

    public void add(Car car) {
        carList.add(car);
    }

    public void delete(Car car) {
        carList.remove(car);
    }

    public PieChartModel getPieChartModel() {
        pieModel2 = new PieChartModel();

        int less = 0;
        int more = 0;

        for (Car c : carList) {
            if (c.getMilage() >= 15000) {
                more++;
            } else {
                less++;
            }
        }

        pieModel2.set("Less than 15000", less);
        pieModel2.set("More than 15000", more);

        pieModel2.setTitle("Milages");
        pieModel2.setLegendPosition("e");
        pieModel2.setFill(false);
        pieModel2.setShowDataLabels(true);
        pieModel2.setDiameter(150);
        pieModel2.setShadow(false);

        return pieModel2;
    }
}
