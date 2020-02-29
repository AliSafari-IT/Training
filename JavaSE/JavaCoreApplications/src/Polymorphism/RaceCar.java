package Polymorphism;

/**
 *
 * @author Ali
 */
public class RaceCar extends Car {

    public RaceCar(int g) {
        super(2 * g);
    }

    public static void main(String[] args) {
        Car car = new Car(5);
        Car fastCar = new RaceCar(5);
        car.display();  //Fuel: 5
        car.addFuel();
        car.display();  //Fuel: 5	Fuel: 6	
        fastCar.display();  //Fuel: 5	Fuel: 6	Fuel: 10	
        fastCar.addFuel();
        fastCar.display();  //Fuel: 5	Fuel: 6	Fuel: 10	Fuel: 11	
    }
}

// OUTPUT:  5 6 10 11

/* 
The code compiles correctly, and because RaceCar extends the Car class, 
all the public object methods of Car can be used by RaceCar objects.
*/
