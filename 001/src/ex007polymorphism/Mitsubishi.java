package ex007polymorphism;

public class Mitsubishi extends Car{

    public Mitsubishi(int cylinders, String name) {
        super(cylinders, name);
    }

    public String startEngine(){
        return "Mitsubishi -> Starting engine";
    }

    public String accelerate(){
        return "Mitsubishi -> Car is accelerating";
    }

    public String brake(){
        return "Mitsubishi -> Car is braking";
    }
}
