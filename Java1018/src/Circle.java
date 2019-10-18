public class Circle extends Shape{

    private double radius;

    public Circle(){
        this(0);
    }

    public Circle(double radius) {
        super("circle shape");
        this.radius = radius;
    }

    @Override
    public double area() {
        return Math.PI * radius * radius;
    }

    @Override
    public double perimeter() {
        return 2 * Math.PI * radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

}