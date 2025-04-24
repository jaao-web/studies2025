package ex007polymorphism;

public class Holden extends Car{

    public Holden(int cylinders, String name) {
        super(cylinders, name);
    }

    public String startEngine(){
        return "Holden -> Starting engine";
    }

    public String accelerate(){
        return "Holden -> Car is accelerating";
    }

    public String brake(){
        return "Holden -> Car is braking";
    }
}
