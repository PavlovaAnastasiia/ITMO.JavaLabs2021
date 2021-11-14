package lab2;

import java.util.Scanner;

public class lab2 {
    public static void main(String[] args) {
        //task1: Вывести нечетные числа с 1 до 99 на консоль
        //CountOdd();

        //task2: Вывести числа, которые делятся на 3,5 и на то и другое
        //DivFiveThree();

        //task3: вычислить сумму двух цлых чисел и вернуть true, если сумма равна третьему
        //Addition();

        //task4: принимает от пользователя три целых числа и возвращает true, если второе число больше первого числа, а третье число больше второго числа
        //Comparison();

        //task5: является ли число 3 как первый или последний элемент массива целых чисел
        //ArrayCheck();

        //task6: проверить, что массив содержит число 1 или 3
        ArrayCheckOneOrThree();
    }

    public static void CountOdd() {
        for (int i = 0; i < 100; i++) {
            if (i % 2 != 0)
                System.out.println(i);
        }
    }

    public static void DivFiveThree() {
        String divThree = "";
        String divFive = "";
        String divThreeAndFive = "";
        for (int i = 0; i < 100; i++) {
            if (i % 3 == 0 && i % 5 ==0) {
                divThreeAndFive += i + " ";
                System.out.println("Делится на 3 и на 5: " + divThreeAndFive);
                //System.out.println(i);
            }
            else if (i % 3 == 0) {
                divThree += i + " ";
                System.out.println("Делится на 3: " + divThree);
            } else if (i % 5 == 0) {
                divFive += i + " ";
                System.out.println("Делится на 5: " + divFive);
            }
        }
    }
    public static void Addition(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введие первое число:");
        int num1 = scanner.nextInt();
        System.out.println("Введите второе число: ");
        int num2 = scanner.nextInt();
        System.out.println("Введите третье число: ");
        int num3 = scanner.nextInt();

        if (num1 + num2 == num3) {
        System.out.println("Результат: true");
        }
        else {
            System.out.println("Результат: false");
        }
    }
    public static void Comparison(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введие первое число:");
        int num1 = scanner.nextInt();
        System.out.println("Введите второе число: ");
        int num2 = scanner.nextInt();
        System.out.println("Введите третье число: ");
        int num3 = scanner.nextInt();

        if (num1 < num2 && num3 > num2) {
            System.out.println("Результат: true");
        }
        else {
            System.out.println("Результат: false");
        }
    }
    public static void ArrayCheck(){
        int[] numArray = new int[4];
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите четыре числа:");
        for (int i = 0; i< numArray.length; i++){
            numArray[i] = scanner.nextInt();
        }
        String a = "";
        for (int i=0; i<4; i++) {
            a += numArray[i] + " ";
            System.out.println("array:" + a);
        }
        if (numArray[0] == 3 || numArray[3] == 3){
            System.out.println("Результат: true");
        }
        else {
            System.out.println("Результат: false");
        }
    }
    public static void ArrayCheckOneOrThree(){
        int[] numArray = new int[4];
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите четыре числа:");
        for (int i = 0; i< numArray.length; i++){
            numArray[i] = scanner.nextInt();
        }
        String a = "";
        for (int i=0; i<4; i++) {
            a += numArray[i] + " ";
            System.out.println("array:" + a);
        }
        boolean NumChecked;
        for (int j: numArray) {
            if (j == 1 || j == 3) {
                NumChecked = true;
            }
            else{
                NumChecked = false;
            }
            System.out.println("В массиве имеется 1 или 3: "+ NumChecked);
        }
    }
}

