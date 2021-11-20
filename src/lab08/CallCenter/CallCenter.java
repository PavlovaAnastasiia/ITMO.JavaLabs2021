package lab08.CallCenter;

import java.util.ArrayList;
import java.util.List;

public class CallCenter {
    /*public static void dispatchCall1(){
        Employee.Director director = new Employee.Director("Директор","первый");
        Employee.Manager manager = new Employee.Manager("Менеджер", "второй");
        Employee.Manager manager1 = new Employee.Manager("Менеджер1", "второй");
        Employee.Operator operator = new Employee.Operator("Оператор", "третий");
        Employee.Operator operator1 = new Employee.Operator("Оператор1", "третий");
        Employee.Operator operator2 = new Employee.Operator("Оператор2", "третий");
        Employee[] employees = new Employee[]{director, manager, manager1, operator, operator1, operator2};

        for (int i = 0; i <employees.length;i++){
          if(!employees[i].isBusy()){
              System.out.println("Работник " + employees[i] + " сейчас занят и не может ответить на ваш звонок.");
          }
          else {
              System.out.println("Спасибо за звонок");
          }
        } //попытка понять логику
    }*/
    private List<Employee> employees;

    public CallCenter() {
        employees = new ArrayList<>();
    }

    public void dispatchCall(){
        System.out.println("Здравствуйте, вы позвонили в колл-центр, ожидайте ответа оператора.");
        for(Employee employee : employees) {
            if (employee instanceof Employee.Operator && !employee.isBusy()) {
                // Оператор проверяет, принадлежит ли объект определенному типу (типу класса или типу интерфейса)
                System.out.println("Спасибо за ожидание, подключаем Вас к оператору.");
                employee.startCall();
                return;
            }
        }
        System.out.println("К сожалению, все операторы заняты. Подождите, пожалуйста, еще немного.");

        for(Employee employee : employees) {
            if (employee instanceof Employee.Manager && !employee.isBusy()) {
                System.out.println("Спасибо за ожидание, подключаем Вас к менеджеру.");
                employee.startCall();
                return;
            }
        }
                System.out.println("В данный момент все операторы и менеджеры заняты, подождите, пожалуйста, еще несколько минут!");

        for(Employee employee : employees){
            if(employee instanceof Employee.Director && !employee.isBusy()){
                System.out.println("Спасибо за ожидание, подключаем Вас к директору.");
                employee.startCall();
                return;
            }
        }
        System.out.println("Не удалось дозвониться, попробуйте снова.");
    }

    public void add(Employee employee) {
        System.out.println("Добавление " + employee + " выполнено!");
    }
}
