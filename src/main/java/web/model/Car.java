package web.model;

public class Car {
    private String model;
    private int series;
    private int carMileage;

    public Car(String model, int series, int carMileage) {
        this.model = model;
        this.series = series;
        this.carMileage = carMileage;
    }

    public Car() {}

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getSeries() {
        return series;
    }

    public void setSeries(int series) {
        this.series = series;
    }

    public int getCarMileage() {
        return carMileage;
    }

    public void setCarMileage(int carMileage) {
        this.carMileage = carMileage;
    }
}
