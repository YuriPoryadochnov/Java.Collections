abstract public class Plane {
    private int flightRange;
    private int fuelConsumption;

    public int getFlightRange() {
        return flightRange;
    }

    public void setFlightRange(int flightRange) {
        this.flightRange = flightRange;
    }

    public int getFuelConsumption() {
        return fuelConsumption;
    }

    public void setFuelConsumption(int fuelConsumption) {
        this.fuelConsumption = fuelConsumption;
    }

    public Plane(int flightRange, int fuelConsumption) {
        this.flightRange = flightRange;
        this.fuelConsumption = fuelConsumption;
    }
}
