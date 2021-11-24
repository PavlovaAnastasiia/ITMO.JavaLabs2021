package lab08.Parking;

public class Car extends Vehicle{

    String name;

    public Car (int occupiedPlace, String name){
        super(occupiedPlace);
        this.name = name;
    }
}
