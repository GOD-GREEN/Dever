package MODEL;

public abstract class Vehicle {
    private String model;
    private String manufacturer;
    private String color;
    private double price;
    private boolean ABS;

    protected Vehicle(String model, String manufacturer, String color, double price, boolean ABS) {
        this.model = model;
        this.manufacturer = manufacturer;
        this.color = color;
        this.price = price;
        this.ABS = ABS;
    }

    public Vehicle() {}

    public String getModel() {return model;}

    public void setModel(String model) {this.model = model;}

    public String getManufacturer() {return manufacturer;}

    public void setManufacturer(String manufacturer) {this.manufacturer = manufacturer;}

    public String getColor() {return color;}

    public void setColor(String color) {this.color = color;}

    public double getPrice() {return price;}

    public void setPrice(double price) {this.price = price;}

    public boolean isABS() {return ABS;}

    public void setABS(boolean ABS) {this.ABS = ABS;}
}
