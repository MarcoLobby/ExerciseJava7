package it.DevelHope.ExerciseJava7;

public abstract class Vehicle {

    private String type;
    private int numberOfWheels;

    // COSTRUTTORE DI DEFAULT SENZA PARAMETRI.
    public Vehicle(){
        type = "";
        numberOfWheels = 0;
    }

    // COSTRUTTORI CON UN SOLO PARAMETRO.
    public Vehicle(String type){
        this.type= type;
        numberOfWheels= 0;
    }

    public Vehicle(int numberOfWheels){
        this.numberOfWheels= numberOfWheels;
        type = "";
    }

    // COSTRUTTORE CON TUTTI GLI ATTRIBUTI DELLA CLASSE COME PARAMETRI.
    public Vehicle(String type, int numberOfWheels){
        this.type = type;
        this.numberOfWheels = numberOfWheels;
    }

    // GETTERS.
    public String getType(){
        return type;

    }

    public int getNumberOfWheels() {
        return numberOfWheels;
    }

    // SETTER.
    public void setType(String type){
        this.type = type;
    }

    public void setNumberOfWheels(int numberOfWheels){
        this.numberOfWheels = numberOfWheels;
    }

    // METODO DI DEFAULT CHE PRINTA GLI ATTRIBUTI DELLA CLASSE.
    public void showVehicleDetails(){
        System.out.println("The type of the vehicle is " + type + " and the number of wheels are "+ numberOfWheels);
    }

    // METODO ASTRATTO PER RIPRODURRE SUONO VEICOLO.
    public abstract void doVehicleSound();

    // METODO ASTRATTO PER PRINTARE PESO E VELOCITA' MASSIMA DELLA BARCA.
    public abstract void getBoatWeightAndSpeed();

}
