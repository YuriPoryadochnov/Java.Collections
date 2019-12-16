public class AirCompany {
    private int countOfCargoPlane;
    private int countOfPassengerAirCraft;

    public int getCountOfCargoPlane() {
        return countOfCargoPlane;
    }

    public void setCountOfCargoPlane(int countOfCargoPlane) {
        this.countOfCargoPlane = countOfCargoPlane;
    }

    public int getCountOfPassengerAirCraft() {
        return countOfPassengerAirCraft;
    }

    public void setCountOfPassengerAirCraft(int countOfPassengerAirCraft) {
        this.countOfPassengerAirCraft = countOfPassengerAirCraft;
    }

    public AirCompany(int countOfCargoPlane, int countOfPassengerAirCraft) {
        this.countOfCargoPlane = countOfCargoPlane;
        this.countOfPassengerAirCraft = countOfPassengerAirCraft;
    }
}
