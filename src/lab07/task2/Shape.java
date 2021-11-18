package lab07.task2;

public abstract class Shape {
    protected double volume;

    public double getVolume(){

        return volume;
    }
    public Shape (double volume){
        this.volume = volume;
    }

    public abstract String ToString();
}
