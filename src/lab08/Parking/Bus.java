package lab08.Parking;

public class Bus extends Vehicle{

    String name;
    public Bus (int occupiedPlace, String name){
        super(occupiedPlace);
        this.name = name;
    }
}
