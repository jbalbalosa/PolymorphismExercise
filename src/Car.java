package PACKAGE_NAME;

public class Car {

    //Base Class

    private boolean engine;
    private int cylinders;
    private String name;
    private int wheels;


    public Car(int cylinders, String name) {
        this.cylinders = cylinders;
        this.name = name;
        this.engine = true;
        this.wheels = 4;
    }

    public int getCylinders() {
        return cylinders;
    }

    public String getName() {
        return name;
    }

    public String startEngine(){
        return getClass().getSimpleName() + " -> startEngine()"  ;
    }

    public String accelerate(){
        return getClass().getSimpleName() + " -> accelerate()";
    }

    public String  brake(){
        return getClass().getSimpleName() + " -> brake()";
    }

}
