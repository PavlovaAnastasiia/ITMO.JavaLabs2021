package lab08;

import lab08.CallCenter.CallCenter;
import lab08.CallCenter.Employee;

public class lab8 {
    public static void main(String[] args){
        //task1: в 7 лабе присутствует абстрактный класс Shape

        //task2: Имеется центр обработки звонков с тремя уровнями сотрудников: оператор,
        //менеджер и директор. Входящий телефонный звонок адресуется свободному оператору.
        // Если оператор не может обработать звонок, он автоматически
        //перенаправляется менеджеру. Если менеджер занят, то звонок перенаправляется директору.
        // Разработайте классы и структуры данных для этой задачи.
        //Реализуйте метод dispatchCall(), который перенаправляет звонок первому свободному сотруднику.
        callCenterOffice();

        //task3: Разработайте модель автостоянки, используя принципы ООП.

    }
    public static void callCenterOffice(){
        CallCenter officeCallCenter = new CallCenter();
        officeCallCenter.add(new Employee.Director("Анастасия", "1",false));
        officeCallCenter.add(new Employee.Manager("Григорий", "2",true));
        officeCallCenter.add(new Employee.Operator("Иван","3",false));
        //как я понимаю, метод employee.isBusy() не считывает инициализированное значение,
        //потому что на консоли выводится значение, будто все работники заняты
        //как решить эту проблему?

        for (int i = 0; i < 4; i++) {
            officeCallCenter.dispatchCall();
        }
    }

}
