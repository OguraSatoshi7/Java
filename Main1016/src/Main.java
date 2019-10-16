public class Main {
    public static void main(String[] args) {
        Car Car1 = new Car("toyota", "collor", "blue", true, 50.0d);
        System.out.println(Car1.toString());

        System.out.println("------");

        Car Car2 = new Car("honda", "civic", "red", false, 40.0d);
        System.out.println(Car2.toString());

        System.out.println("------");

        Car Car3 = new Car("pontiac", "vibe", "blue", true, 55.0d);
        System.out.println(Car3.toString());

        System.out.println("------");

        Car Car4 = new Car();
        Car4.setMake("HYUNDAI");
        Car4.setModel("santafe");
        System.out.println(Car4.toString());

        Car Car5 = new Car("lanbolgini", "s");


    }

}
