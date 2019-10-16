public class Car {

    //default constructor
    public Car(){
        this("unknown", "unknown","white", true, 10.0d);
    }


    public Car(String make, String model){
        this(make,model, "purple", true, 25.0d);
    }


    //overload constructor
    public Car(String make, String model, String color, boolean automatic, double fuel){
        this.make=make;
        this.model=model;
        this.color=color;
        this.automatic=automatic;
        this.fuel=fuel;
    }

    //access modifier
    private String make;
    private String model;
    private String color;
    private boolean automatic;
    private double fuel;

    public String getMake(){
        return make;
    }

    public String getColor() {
        return color;
    }

    public String getModel(){
        return model;
    }

    public double getFuel() {
        return fuel;
    }

    public boolean getAutomatic(){
        return automatic;
    }

    public void setMake(String make){
        this.make = make.toLowerCase();
    }

    public void setColor(String color){
        this.color = color;
    }

    public void setModel(String model){
        this.model = model;
    }

    public void setAutomatic(boolean automatic){
        this.automatic = automatic;
    }

    public void setFuel(double fuel){
        this.fuel = fuel;
    }

    public String toString(){
        StringBuilder sb = new StringBuilder("make : ");
        sb.append(this.getMake());
        sb.append(" Model : ");
        sb.append(this.getModel());
        sb.append(" Color : ");
        sb.append(this.getColor());
        sb.append(" Fuel : ");
        sb.append(this.getFuel());
        sb.append(" Automatic : ");
        sb.append(this.getAutomatic());

        return sb.toString();


    }


}
