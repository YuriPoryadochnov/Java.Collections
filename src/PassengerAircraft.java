public class PassengerAircraft extends Plane {
    private int passengerCapacity;

    public int getPassengerCapacity() {
        return passengerCapacity;
    }

    public void setPassengerCapacity(int passengerCapacity) {
        this.passengerCapacity = passengerCapacity;
    }

    public PassengerAircraft(int flightRange, int fuelConsumption, int passengerCapacity) {
        super(flightRange, fuelConsumption);
        this.passengerCapacity = passengerCapacity;
    }
}
