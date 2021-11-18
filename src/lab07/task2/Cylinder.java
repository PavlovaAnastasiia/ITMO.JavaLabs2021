package lab07.task2;

public class Cylinder extends SolidOfRevolution{
    protected double height;

    public Cylinder (double volume, double radius, double height){
        super(volume, radius);
        this.height = height;
    }

    @Override
    public String ToString() {
        return "Радиус цилиндра: " + radius + ", объем цилиндра: " + volume +  ", высота цилиндра: " + height;
    }
}
