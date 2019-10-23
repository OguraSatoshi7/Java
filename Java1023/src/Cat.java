public class Cat implements  Animal, Pet {


    private Toy toy;

    public Cat() {
        toy = new Toy("fish toy", "black");
    }

    public Cat(Toy toy) {
        this.toy = toy;
    }

    public Toy getToy() {
        return toy;
    }

    public void setToy(Toy toy) {
        this.toy = toy;
    }

    @Override
    public void makeSound() {
        System.out.println("meow meow");
    }

    @Override
    public void eat() {
        System.out.println("I am eating tuna");
    }

    @Override
    public void move() {
        System.out.println("I am sleepy, I will not move");
    }

    @Override
    public void wash() {
        System.out.println("I lick myself");
    }

    @Override
    public void feed() {
        System.out.println("I am feeding the cat");
    }

    @Override
    public void cuddle() {
        System.out.println("do some mrrrrrr sound");
    }
}