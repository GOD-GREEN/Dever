package MODEL;

public class Motocycle extends Vehicle{
    private int power;
    private String category;

    public Motocycle(String model, String manufacturer, String color,
                     double price, String ABS, int power, String category) {
        super(model, manufacturer, color, price, ABS);
        this.power = power;
        this.category = category;
    }

    public Motocycle() {}

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }
}
