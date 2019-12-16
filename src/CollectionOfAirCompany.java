import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class CollectionOfAirCompany {


    public static void main(String[] args) {
        AirCompany exampleAirCompany = new AirCompany(3,3);
        ArrayList<PassengerAircraft> listPassengerAirCraft = new ArrayList<>();
        ArrayList<CargoPlane> listCargoPlane = new ArrayList<>();
        listPassengerAirCraft.add(new PassengerAircraft(500,200,60));
        listPassengerAirCraft.add(new PassengerAircraft(400,100,70));
        listPassengerAirCraft.add(new PassengerAircraft(700,300,40));
        listCargoPlane.add(new CargoPlane(500,200,100));
        listCargoPlane.add(new CargoPlane(300,80,60));
        listCargoPlane.add(new CargoPlane(700,300,120));
        Iterator<CargoPlane> iteratorOfCargoPlanes = listCargoPlane.iterator();
        int totalLoadCapacity = 0;
        while(iteratorOfCargoPlanes.hasNext())
        {
            CargoPlane cargoPlane = iteratorOfCargoPlanes.next();
            totalLoadCapacity += cargoPlane.getCarrying();
        }
        System.out.println("Общая грузоподъемность: " + totalLoadCapacity);

        Iterator<PassengerAircraft> iteratorOfPassengerPlanes = listPassengerAirCraft.iterator();
        int totalPassengerCapacity = 0;
        while(iteratorOfPassengerPlanes.hasNext())
        {
            PassengerAircraft passengerAircraft = iteratorOfPassengerPlanes.next();
            totalPassengerCapacity += passengerAircraft.getPassengerCapacity();
        }
        System.out.println("Общая вместимость людей: " + totalPassengerCapacity);
        ArrayList<Plane> listOfPlane = new ArrayList<>();
        listOfPlane.addAll(listCargoPlane);
        listOfPlane.addAll(listPassengerAirCraft);
        listOfPlane.sort((o1,o2) -> o1.getFlightRange()-o2.getFlightRange());
        Iterator<Plane> iterarorOfListPlane = listOfPlane.iterator();
        while(iterarorOfListPlane.hasNext())
        {
            Plane plane = iterarorOfListPlane.next();
            System.out.println(plane.getFlightRange());
        }
        System.out.println("////");
        int lowerLimitOfFuelConsumption = 100;
        int upperLimitOfFuelConsumption = 200;
        listOfPlane.removeIf((o1) -> o1.getFuelConsumption() < lowerLimitOfFuelConsumption);
        listOfPlane.removeIf((o1) -> o1.getFuelConsumption() > upperLimitOfFuelConsumption);
        Iterator<Plane> iterarorOfFuelConsumptionListPlane = listOfPlane.iterator();
        while(iterarorOfFuelConsumptionListPlane.hasNext())
        {
            Plane plane = iterarorOfFuelConsumptionListPlane.next();
            System.out.println(plane.getFuelConsumption());
        }
    }
}
