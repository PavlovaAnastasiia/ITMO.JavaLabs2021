package lab7.task2;

public class Ball extends SolidOfRevolution{
    public Ball (double volume, double radius){
        super(volume,radius);
    }

    @Override
    public String ToString() {
        return "Радиус шара: " + radius + ", объем шара: " + volume;
    }
}
