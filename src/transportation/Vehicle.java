package transportation;

public abstract class Vehicle {
    private String model;
    private double distance;
    private int maxPassengers;
    private double maxSpeed;

    public Vehicle(String model, int maxPassengers, double maxSpeed) {
        this.model = model;
        this.distance = 0;
        this.maxPassengers = maxPassengers;
        this.maxSpeed = maxSpeed;
    }

    public String getModel() {
        return model;
    }

    public double getDistance() {
        return distance;
    }

    public void setDistance(double distance) {
        this.distance = distance;
    }

    public int getMaxPassengers() {
        return maxPassengers;
    }

    public double getMaxSpeed() {
        return maxSpeed;
    }

    public abstract String toString();
    public abstract boolean equals(Object obj);
}
