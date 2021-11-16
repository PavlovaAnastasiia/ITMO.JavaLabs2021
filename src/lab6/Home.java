package lab6;

import java.time.LocalDate;
import java.util.Scanner;

public class Home {
    int floors;
    int buildYear;
    String name;

    public Home (int floors, int buildYear, String name){
        this.floors = floors;
        this.buildYear = buildYear;
        this.name = name;
    }
    public Home(){
        this(0,0,"Дома не существует");
    }

    /*public void writeInfo(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите значения: ");       //не понимаю, как потом использовать этот метод
        System.out.println("Количество этажей - ");     //для вывщда значеий ((
        this.floors = sc.nextInt();
        System.out.println("Год постройки - ");
        this.buildYear = sc.nextInt();
        System.out.println("Наименование - ");
        this.name = sc.next();
        System.out.println("Спасибо за ввод!");
    }*/

    public void Home (int floors, int buildYear, String name) {
        this.floors = floors;
        this.buildYear = buildYear;
        this.name = name;
    }

    public int countYearsFromConstruction (){
        LocalDate currentDate = LocalDate.now();
        return  currentDate.getYear() - buildYear;
    }
    @Override
    public String toString() { //вывод данных
        return "Дом был построен в " + buildYear + " году, " +
                "его имя - " + name +
                "; он имеет " + floors + " этажей.";
    }
}
