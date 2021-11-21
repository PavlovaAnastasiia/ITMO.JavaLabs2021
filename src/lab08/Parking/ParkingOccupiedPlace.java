package lab08.Parking;

public enum ParkingOccupiedPlace {
    MOTORBIKE (5),
    CAR(15),
    BUS(50);

    public int value;
    ParkingOccupiedPlace(int i) {
        i = value;
    }
}
