package lab7.task2;

public class Cylinder extends SolidOfRevolution{
    protected double height;

    public Cylinder (double volume, double radius, double height){
        super(volume, radius);
        this.height = height;
    }
}
