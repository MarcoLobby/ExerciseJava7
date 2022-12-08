package it.DevelHope.ExerciseJava7;

public class Tester {
    public static void main(String[] args) {
        Car car = new Car(4, 4, 15.000);
        Boat boat = new Boat( 80.0, 900);

        car.showVehicleDetails();
        car.doVehicleSound();
        boat.doVehicleSound();
        boat.showVehicleDetails();
        boat.getBoatWeightAndSpeed();

    }
}
