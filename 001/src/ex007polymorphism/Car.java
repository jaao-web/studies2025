package ex007polymorphism;

public class Car {

    private boolean engine;
    private int cylinders;
    private String name;
    private int wheels;


    public Car(int cylinders, String name) {
        this.engine = true;
        this.wheels = 4;
        this.cylinders = cylinders;
        this.name = name;
    }

    public String startEngine(){
        return "Car -> Starting engine";
    }

    public String accelerate(){
        return "Car -> Car is accelerating";
    }

    public String brake(){
        return "Car -> Car is braking";
    }

    public int getCylinders() {
        return cylinders;
    }

    public String getName() {
        return name;
    }
}
