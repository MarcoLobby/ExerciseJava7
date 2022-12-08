package it.DevelHope.ExerciseJava7;

public class Car extends Vehicle{

    private int numberOfDoors;
    private double carPrice;

    // COSTRUTTORE DI DEFAULT SENZA PARAMETRI.
    public Car(){
        super();
        numberOfDoors = 0;
        carPrice = 0;
    }

    // COSTRUTTORE COMPLETO.
    public Car(int numberOfWheels, int numberOfDoors, double carPrice){
        super("Car", numberOfWheels);
        this.numberOfDoors = numberOfDoors;
        this.carPrice = carPrice;
    }

    // GETTER
    public int getNumberOfDoors() {
        return numberOfDoors;
    }

    public double getCarPrice() {
        return carPrice;
    }


    // SETTER
    public void setNumberOfDoors(int numberOfDoors){
        this.numberOfDoors = numberOfDoors;
    }

    public void setCarPrice(double carPrice){
        this.carPrice = carPrice;
    }


    @Override
    public void showVehicleDetails() {
        super.showVehicleDetails();
        System.out.println("This car has " + numberOfDoors + " doors ");
    }

    @Override
    public void doVehicleSound(){
        System.out.println("The sound of this car is ' WROAAAMM' ");

    }

    @Override
    public void getBoatWeightAndSpeed(){};


}
