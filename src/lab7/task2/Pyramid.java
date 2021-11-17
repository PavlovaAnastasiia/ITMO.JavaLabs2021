package lab7.task2;

public class Pyramid extends Shape{
    protected double s;
    protected double h;

    public Pyramid (double volume, double s, double h){
        super(volume);
        this.s = s;
        this.h = h;
    }
    @Override
    public String ToString(){
        return "s = " + s + ", \n" +
                "h = " + h + ", \n" +
                "volume = " + volume;
    }
}
