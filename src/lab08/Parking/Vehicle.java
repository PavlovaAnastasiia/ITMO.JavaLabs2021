package lab08.Parking;

public class Vehicle {

    protected int occupiedPlace;

    public int getOccupiedPlace(){
        return occupiedPlace;
    }

    public Vehicle (int occupiedPlace){
        this.occupiedPlace = occupiedPlace;
    }

    /*@Override
    public String ToString(){
        return "Транспортное средство занимает " + occupiedPlace + " у.е.";
    }*/
}
