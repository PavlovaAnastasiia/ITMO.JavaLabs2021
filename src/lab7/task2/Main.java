package lab7.task2;

public class Main {
    public static void main(String[] args){

        Box box = new Box(100);
        Ball ball = new Ball(50,10);
        Pyramid pyramid = new Pyramid(30,12,4);
        Cylinder cylinder = new Cylinder(40,10,5);

        System.out.println(box.Add1(ball));
        System.out.println(box.Add1(pyramid));
        System.out.println(box.Add1(cylinder));
    }
}
