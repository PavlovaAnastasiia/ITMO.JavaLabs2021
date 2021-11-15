package lab3;

import java.util.Arrays;
import java.util.Scanner;

public class lab3 {

    public static void main(String[] args) {
        //task1: отсортирован ли массив по возрастанию
        //IncSort(CreateArr());

        //task2: считывает длину массива
        ArrLength(CreateArr());
    }

    public static int[] CreateArr() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите значения массива:");
        int[] myArray = new int[4];

        for (int i = 0; i < myArray.length; i++) {
            myArray[i] = scanner.nextInt();
        }
        return myArray;
    }
    public static void IncSort(int[] myArray){ //1 вариант 1 задания
        for (int i = 0; i< myArray.length; i++){
            int min = myArray[i]; //предполагаем, что первый элемент самый маленький
            boolean isIncSort = true;
            for (int j = i +1; j < myArray.length; j++){
                if (myArray[j] < min){
                    isIncSort = false;
                    break;
                }
            }
         if(!isIncSort){
             System.out.println("Please, try again");
         }
         else{
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
    public static void ArrLength(int[] myArray){
        System.out.println("Array length: " + myArray.length);
        System.out.println("Result: " + Arrays.toString(myArray));
    }
}

