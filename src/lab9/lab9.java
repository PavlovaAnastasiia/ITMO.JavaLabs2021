package lab9;

import java.util.Arrays;
import java.util.NoSuchElementException;

public class lab9 {

    public static void main(String[] args) {
        //task1: метод для поиска наибольшего элемента в двумерном массиве
        //findMaxTest();

        //task2: метод, который проверяет, является ли двумерный массив квадратным
        //isSquareArrTest();

        //task3: метод, который, в двумерном массиве (матрице) ищет строку, сумма
        //элементов которой является максимальной среди всех строк матрицы.

    }


    public static void findMax() throws Exception {

        //int [][] twoDimArray = {{5,7,3,17}, {7,0,1,12}, {8,1,2,3}};
        int[][] twoDimArray = {{0, 0}, {0, 0}};

        System.out.println(Arrays.deepToString(twoDimArray)); // для отображения двумерного массива метод deepToString()
        int maxValue = twoDimArray[0][0];
        for (int i = 0; i < twoDimArray.length; i++) { //идем по строкам
            for (int j = 0; j < twoDimArray[i].length; j++) { // идем по столбцам
                if (maxValue < twoDimArray[i][j]) {
                    maxValue = twoDimArray[i][j];
                }
            }
        }
        if (maxValue <= 0) throw new Exception("Нет чисел больше нуля. Нельзя найти наибольшее!");
        System.out.println("Наибольшее число: " + maxValue);
    }

    public static void findMaxTest() {
        System.out.println("Поиск наибольшего элемента в двумерном массиве: ");
        try {
            findMax();
        } catch (Exception exception) {
            System.out.println(exception);
        }
    }

    public static void isSquareArr() throws Exception {
        //двумерный массив является квадратным, если количество строк = количество столбцов
        //вариант1: выдаст исключение
        //int[][] twoDimArray = {{5, 7, 3, 4, 5, 2, 4, 6}, {7, 0, 6, 4, 2, 2, 4, 7}, {5, 7, 3, 4, 5, 2, 4, 6},
        //{5, 7, 3, 4, 5, 2, 4, 6},{5, 7, 3, 4, 5, 2, 4, 6}, {5, 7, 3, 4, 5, 2, 4, 6},{5, 7, 3, 4, 5, 2, 4, 6}};

        //вариант2: выдаст, что двумерный массив не является квадратным
        //int[][] twoDimArray = {{5, 7, 3, 4, 5, 2, 4, 6}, {7, 0, 6, 4, 2, 2, 4, 7}};

        //вариант3: выдаст, что двумерный массив не является квадратным
        int[][] twoDimArray = {{5, 7}, {7, 0}};

        for (int i = 0; i < twoDimArray.length; i++) { //идем по строкам
            for (int j = 0; j < twoDimArray[i].length; j++) { // идем по столбцам
                if (twoDimArray.length >=7 && twoDimArray[i].length>=7){
                    throw new Exception("Массив слишком большой, невозможно проверить его на крадратичность.");
                }
                else if(twoDimArray.length == twoDimArray[i].length){
                    System.out.println("Двумерный массив является квадратным!");
                    break;
                }
                else {
                    System.out.println("Двумерный массив не является квадратным!");
                    break;
                }
            }
        }
    }
    public static void isSquareArrTest(){
        System.out.println("Является ли двумерный массив квадратным?");
        try {
            isSquareArr();
        }
        catch (Exception exception){
            System.out.println(exception);
        }
    }

    public static void biggestSumLine() throws Exception{
        int [][] twoDimArray = {{5,7,3,17}, {7,0,1,12}, {8,1,2,3}};


    }
}
