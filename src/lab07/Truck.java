package lab07;

import java.util.Scanner;

public class Truck extends Car{
    int wheels;
    double maxWeight;

    /*public void newWheels(int wheels){
        this.wheels = wheels;
        System.out.println("Количество колес: " + this);
    }*/

    public static void newWheels1 (){
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите количество колес: ");
        int wheels = sc.nextInt();
        System.out.println("Количество колес: " + wheels);
    }

    public Truck (int w, String m, char c, float s, int wheels, double maxWeight){
        super(w, m, c, s); //текущий экземпляр родительского класса
        this.wheels = wheels;
        this.maxWeight = maxWeight;
    }

    @Override
    public void outPut(){
        super.outPut();
        System.out.println("Количество колес в машине - " + wheels +
                ". Её максимальный вес может составлять " + maxWeight + " кг.");
    }

    public static void main(String[] args) {
        newWheels1 ();
        Truck truck1 = new Truck(2,"dddd",(char) 5, 92,3,3.0);
        truck1.outPut();
    }
}
