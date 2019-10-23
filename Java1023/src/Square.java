public class Square extends Shape {

    private double length;

    public Square(){
        super("square shape");
    }
    public Square(double length) {
        this.length = length;
    }

    public Square(String name, double length) {
        super(name);
        this.length = length;
    }

    @Override
    public double area() {
        return length*length;
    }

    @Override
    public double perimeter() {
        return 4*length;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }
}