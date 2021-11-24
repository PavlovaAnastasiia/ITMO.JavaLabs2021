package lab08.Parking;

public class Vehicle {

    protected int occupiedPlace;
    String name;

    public int getOccupiedPlace(){
        return occupiedPlace;
    }

    public Vehicle (int occupiedPlace){
        this.occupiedPlace = occupiedPlace;
    }

    public String getName(){
        return name;
    }

    @Override
    public String toString() {

        return "В очереди находятся: " + name;
    }
}
