package model;

public class Car {

    private String brand;

    private String model;

    private int buildYear;

    public Car() {
    }

    public Car(String brand, String model, int buildYear) {
        this.brand = brand;
        this.model = model;
        this.buildYear = buildYear;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getBuildYear() {
        return buildYear;
    }

    public void setBuildYear(int buildYear) {
        this.buildYear = buildYear;
    }

    @Override
    public String toString() {
        return "Car: " + brand + " " + model + " " + buildYear;
    }
}
