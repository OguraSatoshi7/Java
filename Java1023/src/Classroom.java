import java.util.List;

public class Classroom {
    public List<Window> getWindows() {
        return windows;
    }

    public void setWindows(List<Window> windows) {
        this.windows = windows;
    }

    public List<Walls> getWalls() {
        return walls;
    }

    public void setWalls(List<Walls> walls) {
        this.walls = walls;
    }

    public List<Door> getDoors() {
        return doors;
    }

    public void setDoors(List<Door> doors) {
        this.doors = doors;
    }

    public Floor getFloor() {
        return floor;
    }

    public void setFloor(Floor floor) {
        this.floor = floor;
    }

    public Roof getRoof() {
        return roof;
    }

    public void setRoof(Roof roof) {
        this.roof = roof;
    }

    public double getTemperature() {
        return temperature;
    }

    public void setTemperature(double temperature) {
        this.temperature = temperature;
    }

    public boolean isLighton() {
        return isLighton;
    }

    public void setLighton(boolean lighton) {
        isLighton = lighton;
    }

    public Classroom(List<Window> windows, List<Walls> walls, List<Door> doors, Floor floor, Roof roof, double temperature, boolean isLighton) {
        this.windows = windows;
        this.walls = walls;
        this.doors = doors;
        this.floor = floor;
        this.roof = roof;
        this.temperature = temperature;
        this.isLighton = isLighton;
    }

    private List<Window> windows;
    private List<Walls> walls;
    private List<Door> doors;
    private Floor floor;
    private Roof roof;
    private double temperature;
    private boolean isLighton;
//    private List<Chair> chairs;
//    private List<Desk> desks;
//    private List<Computer> computers;
//    private Projector projectors;


}
