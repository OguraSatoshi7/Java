public class Toy {

    private String name;
    private String color;

    public Toy(){
        name = "a toy";
        color = "white";
    }

    public Toy(String name, String color) {
        this.name = name;
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}