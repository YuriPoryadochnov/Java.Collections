public class CargoPlane extends Plane {
   private int carrying;

    public int getCarrying() {
        return carrying;
    }

    public void setCarrying(int carrying) {
        this.carrying = carrying;
    }

    public CargoPlane(int flightRange, int fuelConsumption, int carrying) {
        super(flightRange,fuelConsumption);
        this.carrying = carrying;
    }
}
