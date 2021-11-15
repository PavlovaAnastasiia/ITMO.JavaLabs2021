package lab3;

import java.util.Arrays;
import java.util.Scanner;

public class lab3 {

    public static void main(String[] args) {
        //task1: отсортирован ли массив по возрастанию
        //IncSort1(CreateArr());

        //task2: считывает длину массива
        //ArrLength(CreateArr());

        //task3: меняет местами первый и последний элемент массива
        //SwitchFirstAndLast(CreateArr());

        //task4: найти первое уникальное число
        //firstUniqueVar(CreateArr());

        //task5: вычистить н-ое число Фибоначчи
        //FibonacciNum(15);

        //task6: сортировка слиянием

    }

    public static int[] CreateArr() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите количество значений массива:");
        int size = scanner.nextInt();
        System.out.println("Введите значения массива:");
        int[] myArray = new int[size];

        for (int i = 0; i < myArray.length; i++) {
            myArray[i] = scanner.nextInt();
        }
        return myArray;
    }

    public static void IncSort(int[] myArray) { //1 вариант 1 задания
        for (int i = 0; i < myArray.length; i++) {
            int min = myArray[i]; //предполагаем, что первый элемент самый маленький
            boolean isIncSort = true;
            for (int j = i + 1; j < myArray.length; j++) {
                if (myArray[j] < min) {
                    isIncSort = false;
                    break;
                }
            }
            if (!isIncSort) {
                System.out.println("Please, try again");
            } else {
                System.out.println("OK");
            }
        }
    }

    public static void IncSort1(int[] myArray) {//2 вариант 1 задания
        int i;
        boolean isIncSort = true;
        for (i = 0; i < myArray.length - 1; i++) {
            if (myArray[i] > myArray[i + 1]) {
                isIncSort = false;
                break;
            }
        }
        if (!isIncSort) {
            System.out.println("Please, try again");
        } else {
            System.out.println("OK");
        }
    }

    public static void ArrLength(int[] myArray) { // второе задание
        System.out.println("Array length: " + myArray.length);
        System.out.println("Result: " + Arrays.toString(myArray));
    }

    public static void SwitchFirstAndLast(int[] myArray) {
        System.out.println("Array 1: " + Arrays.toString(myArray));

        int var = myArray[0];
        myArray[0] = myArray[myArray.length - 1];
        myArray[myArray.length - 1] = var;

        System.out.println("Array 2:" + Arrays.toString(myArray));
    }

    public static void firstUniqueVar(int[] myArray) {

        boolean isNotUnique = false;
        int uniqueVal = 0;
        for (int i = 0; i < myArray.length; i++) {
            for (int j = 0; j < myArray.length; j++) {
                if (i == j) {
                    continue;
                }
                if (myArray[i] == myArray[j]) {
                    isNotUnique = true;
                    break;
                }
            }
            if (!isNotUnique) {
                uniqueVal = myArray[i];
                break;
            }
            isNotUnique = false;
        }
        if (!isNotUnique) {
            System.out.println("Первое уникальное число: " + uniqueVal);
        } else {
            System.out.println("Массив не содержит уникальных значений");
        }
    }
    public static void FibonacciNum (int n){
        int num1 = 1;
        int num2 = 1;
        int res;
        System.out.println(num1);
        System.out.println(num2);
        for (int i = 0; i <= n; i++){
            res = num1 + num2;
            System.out.println(res + "");
            num1 = num2;
            num2 = res;
        }
        System.out.println();
    }

