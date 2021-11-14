package lab1;
import java.util.Scanner;

public class lab1 {
    public static void main(String[] args) {
        //task 1: вывести строки
        Print();

        //task2: посчитать результат выражения
        Counter();

        //task3: вывести результат на консоль
        Res();

        //task4: результат умножения
        MultiRes();

        //task5: считать целые числа из стандартного ввода
        ReadInt();

        //task6
        IsNumEven();
    }

    public static void Print(){
        System.out.println("Я");
        System.out.println("хорошо");
        System.out.println("знаю");
        System.out.println("Java.");
    }
    public static void Counter(){
        double a = (46.0 + 10.0)*(10.0/3.0);
        int b = 29*4*(-15);
        System.out.println("Res1: "+a);
        System.out.println("Res2: "+b);
    }
    public static void Res(){
        int number = 10500;
        int result = (number/10)/10;
        System.out.println("Result: "+result);
    }
    public static void MultiRes(){
        double a = 3.6;
        double b = 4.1;
        double c = 5.9;
        double result = a*b*c;
        System.out.println("Multiplication result: " + result);
    }
    public static void ReadInt(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Write 3 numbers:");
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        int num3 = scanner.nextInt();
        System.out.println("Number1: "+num1);
        System.out.println("Number2: "+num2);
        System.out.println("Number3: "+num3);
    }
    public static void IsNumEven(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Write a number:");
        int b = scanner.nextInt();
        if (b % 2 == 0 && b < 100){
            System.out.println("Четное");
        }
        else if (b % 2 != 0) {
        System.out.println("Нечетное");
    }
        else if (b % 2 == 0 && b > 100) {
            System.out.println("Выход за пределы диапазона");
        }
    }
}
