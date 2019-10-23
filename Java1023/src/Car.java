public class Car {

    //access modifiers
    private String make;
    private String model;
    private String color;
    private boolean automatic;
    private double fuel;
    private double speed;

    public double getSpeed() {
        return speed;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }

    public Car(){
        this("unknown", "unknown", "black", true, 10.0,0);
    }

    public Car(String make, String model) {
        this(make, model, "white", false, 25.0d, 0d);
    }

    public Car(String make, String model, String color, boolean automatic, double fuel, double speed) {
        this.make = make.toLowerCase();
        this.model = model.toLowerCase();
        this.color = color;
        this.automatic = automatic;
        this.fuel = fuel;
        if(speed >=0 && speed <=180) {
            this.speed = speed;
        }else{
            this.speed = 0;
        }

    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make.toLowerCase();
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model.toLowerCase();
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isAutomatic() {
        return automatic;
    }

    public void setAutomatic(boolean automatic) {
        this.automatic = automatic;
    }

    public double getFuel() {
        return fuel;
    }

    public void setFuel(double fuel) {
        this.fuel = fuel;
    }

    public void accelerate(){

        if(speed <= 170){
            speed += 10;
        }
        System.out.println("your speed is : " + speed);

    }

    @Override
    public String toString() {
        return "Car{" +
                "make='" + make + '\'' +
                ", model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", automatic=" + automatic +
                ", fuel=" + fuel +
                '}';
    }
}
