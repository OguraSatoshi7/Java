public class Rectangle extends Shape{

    private double height;
    private double width;

    public Rectangle(){
        this(0,0);
    }

    public Rectangle(double height, double width){
        super("rectangle shape");
        this.height = height;
        this.width = width;
    }

    public Rectangle(double height, double width, String name){
        super(name);
        this.height = height;
        this.width = width;
    }

    @Override
    public double area(){
        return height*width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    @Override
    public double perimeter(){
        return 2 * (height + width);
    }
}