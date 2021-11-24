package lab08;

import lab08.CallCenter.CallCenter;
import lab08.CallCenter.Employee;
import lab08.Parking.*;

import java.util.Arrays;

public class lab8 {
    public static void main(String[] args) {
        //task1: в 7 лабе присутствует абстрактный класс Shape

        //task2: Имеется центр обработки звонков с тремя уровнями сотрудников: оператор,
        //менеджер и директор. Входящий телефонный звонок адресуется свободному оператору.
        // Если оператор не может обработать звонок, он автоматически
        //перенаправляется менеджеру. Если менеджер занят, то звонок перенаправляется директору.
        // Разработайте классы и структуры данных для этой задачи.
        //Реализуйте метод dispatchCall(), который перенаправляет звонок первому свободному сотруднику.
        //callCenterOffice();

        //task3: Разработайте модель автостоянки, используя принципы ООП.
        parkingLot();
    }

    public static void callCenterOffice() {
        CallCenter officeCallCenter = new CallCenter();
        officeCallCenter.add(new Employee.Director("Анастасия", "1", false));
        officeCallCenter.add(new Employee.Manager("Григорий", "2", true));
        officeCallCenter.add(new Employee.Operator("Иван", "3", false));
        //как я понимаю, метод employee.isBusy() не считывает инициализированное значение,
        //потому что на консоли выводится значение, будто все работники заняты
        //как решить эту проблему?

        for (int i = 0; i < 4; i++) {
            officeCallCenter.dispatchCall();
        }
    }

    public static void parkingLot() {
        Vehicle[] vehicles = new Vehicle[]{
                new Car(1, "Машина BMW"),
                new Bus(5, "Автобус Mercedes"),
                new Motorbike(1, "Мотоцикл Nissan")};

        Parking parking = new Parking(10);
        for (Vehicle vehicle : vehicles) {
            parking.add(vehicle);
        }
        parking.print(new Car(1, "Машина BMW"));//не понимаю, почему не выводит имя
    }
}
