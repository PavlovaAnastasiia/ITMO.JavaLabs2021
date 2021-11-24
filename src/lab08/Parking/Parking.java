package lab08.Parking;

import java.util.ArrayList;
import java.util.Arrays;

public class Parking extends Vehicle{

    protected int finalOccupiedPlace;
    protected static ArrayList<Vehicle> vehicles;

    public Parking (int occupiedPlace){
        super(occupiedPlace);

        vehicles = new ArrayList<>();
    }

    public boolean add(Vehicle vehicle) {
        finalOccupiedPlace = +vehicle.getOccupiedPlace();

        if (finalOccupiedPlace <= super.occupiedPlace) {
            vehicles.add(vehicle);
            System.out.println("Транспортное средство может быть припарковано!");
            return true;
        } else {
            System.out.println("К сожалению, все места заняты.");
            return false;
        }
    }
    public static void viewVehicles(){
        System.out.println(Arrays.toString(vehicles.toArray()));
    }
}
