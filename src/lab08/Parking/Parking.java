package lab08.Parking;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Parking extends Vehicle{

    private int finalOccupiedPlace;
    private ArrayList<Vehicle> vehicles;

    public Parking (int occupiedPlace){
        super(occupiedPlace);
        vehicles = new ArrayList<>();
    }

    public boolean add(Vehicle vehicle) {
        finalOccupiedPlace += vehicle.getOccupiedPlace();

        if (finalOccupiedPlace <= super.occupiedPlace) {
            vehicles.add(vehicle);
            System.out.println("Транспортное средство может быть припарковано!");
            return true;
        } else {
            System.out.println("К сожалению, все места заняты.");
            return false;
        }
    }
    public void print(Vehicle vehicle) {
        System.out.println(vehicle.toString());
    }
}
