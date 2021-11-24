package lab08.Parking;

public class Motorbike extends Vehicle{

    String name;

    public Motorbike (int occupiedPlace, String name){
        super(occupiedPlace);
        this.name = name;
    }
}
