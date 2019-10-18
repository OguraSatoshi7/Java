import java.util.*;

public class Main {
    public static void main(String[] args) {

        Rectangle rec = new Rectangle(50d, 100d);
        System.out.println(rec.getName());

        Box aBox = new Box("metal", 9d);
        System.out.println(aBox.area());


        Shape[] shapeArr = new Shape[]{
                new Circle(2.5),
                new Rectangle(5.4,9.3),
                new Square(4.5)
        };


        Scanner sn = new Scanner(System.in);
        System.out.println("provide a index 0 1 or 2");
        int indexNum = sn.nextInt();

        if (indexNum == 0) {

            System.out.println("radius?");
            double r = sn.nextDouble();
            ((Circle) shapeArr[indexNum]).setRadius(r);

            System.out.println("raius modified to " + r);
            System.out.println("the area of circle is");
            System.out.println(((Circle) shapeArr[indexNum]).area());

        } else if (indexNum == 1) {

            System.out.println("height?");
            double h = sn.nextDouble();
            System.out.println("width");
            double w = sn.nextDouble();
            ((Rectangle) shapeArr[1]).setHeight(h);
            ((Rectangle) shapeArr[1]).setWidth(w);

            System.out.println("heigth modified to " + h);
            System.out.println("width modified to " + w);
            System.out.println("the area of rectangle is");
            System.out.println(((Rectangle) shapeArr[indexNum]).area());

        } else if (indexNum == 2) {

            System.out.println("length?");
            double l = sn.nextDouble();
            ((Square) shapeArr[indexNum]).setLength(l);

            System.out.println("length modified to " + l);
            System.out.println("the area of square is");
            System.out.println(((Square) shapeArr[indexNum]).area());

        }


    }

}
