package MODEL;

public class Cars extends Vehicle{
    private int HP;
    private int enginePower;
    private int doors;

    public Cars(String model, String manufacturer, String color, double price, boolean ABS, int HP, int enginePower, int doors) {
        super(model, manufacturer, color, price, ABS);
        this.HP = HP;
        this.enginePower = enginePower;
        this.doors = doors;
    }

    public Cars() {}

    public int getHP() {
        return HP;
    }

    public void setHP(int HP) {
        this.HP = HP;
    }

    public int getEnginePower() {
        return enginePower;
    }

    public void setEnginePower(int enginePower) {
        this.enginePower = enginePower;
    }

    public int getDoors() {
        return doors;
    }

    public void setDoors(int doors) {
        this.doors = doors;
    }
}
