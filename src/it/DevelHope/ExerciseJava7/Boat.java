package it.DevelHope.ExerciseJava7;

public class Boat extends Vehicle{

    private double maxKnotsSpeed;
    private int boatKilosWeight;

    // COSTRUTTORE DI DEFAULT SENZA PARAMETRI.
    public Boat(){
        super();
        maxKnotsSpeed = 0;
        boatKilosWeight = 0;
    }
    // COSTRUTTORE COMPLETO
    public Boat(double maxKnotsSpeed, int boatKilosWeight){
        super("Boat");
        this.maxKnotsSpeed = maxKnotsSpeed;
        this.boatKilosWeight = boatKilosWeight;
    }

    // GETTER
    public double getMaxKnotsSpeed(){
        return maxKnotsSpeed;
    }
    public int getBoatKilosWeight(){
        return boatKilosWeight;
    }

    // SETTER
    public void setMaxKnotsSpeed(double maxKnotsSpeed){
        this.maxKnotsSpeed = maxKnotsSpeed;
    }

    public void setBoatKilosWeight(int boatKilosWeight){
        this.boatKilosWeight = boatKilosWeight;
    }

    @Override
    public void getBoatWeightAndSpeed() {
        System.out.println( "The weight of this boat is " + boatKilosWeight + "Kg and its maximum speed is " + maxKnotsSpeed);
    }

    @Override
    public void doVehicleSound() {
        System.out.println( "The sound of this Boat is 'WRUUUUMM' ");
    }
}
