package lab9;

import java.util.Arrays;

public class lab9 {

    public static void main(String[] args) {
        //task1: метод для поиска наибольшего элемента в двумерном массиве
        //findMaxTest();

        //task2: метод, который проверяет, является ли двумерный массив квадратным
        //isSquareArrTest();

        //task3: метод, который, в двумерном массиве (матрице) ищет строку, сумма
        //элементов которой является максимальной среди всех строк матрицы.
        //biggestSumLineTest();

        //task4: Двумерный массив MxN заполнить случайными символами алфавита
        createCharMatrixTest();
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

        for (int i = 0; i < twoDimArray.length; i++) {
            for (int j = 0; j < twoDimArray[i].length; j++) {
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
        //красивый вывод матрицы

        //пример1: выведет макс сумму в некоторой строке
        //int [][] twoDimArray = { {7,0,1,12},{5,7,3,17}, {8,1,2,3}};
        //пример2: выведет ошибку
        int [][] twoDimArray = { {0,0},{0,0}, {0,0}};

        System.out.println("Двумерный массив: ");

        for (int i = 0; i < twoDimArray.length; i++){
            System.out.println();
            for (int j = 0; j < twoDimArray[i].length; j++) {
                System.out.print(twoDimArray[i][j] + " ");
            }
        }
        System.out.println();

        //поиск максимальной суммы
        int sumLineMax = 0;
        for (int i = 0; i <twoDimArray.length ; i++) {
            int sumLine = 0;
            for (int j = 0; j < twoDimArray[i].length; j++) {
                sumLine = sumLine + twoDimArray[i][j]; //считает сумму строки
            }
            if(sumLineMax<sumLine){
                sumLineMax = sumLine;
            }
        }
        if(sumLineMax == 0) throw new Exception("Нельзя найти наибольшую сумму в любой из строк, сумма в каждой строке равна нулю!");
        System.out.println("\n Максимальная сумма в некоторой строке равна " + sumLineMax);
    }

    public static void  biggestSumLineTest() {
        System.out.println("\n Поиск максимальной суммы некоторой строки в матрице");
        try {
            biggestSumLine();
        } catch (Exception exception) {
            System.out.println(exception);
        }
    }
    public static char[][] createCharMatrix(int line, int column) throws Exception {
        if(line < 2) throw new Exception("Матрица не может содержать менее 2 строк");
        if(column == 0) throw new Exception("Матрица не может содержать меньше одной колонны");

        char[][] twoDimArray = new char[line][column];
        for (int i = 0; i <twoDimArray.length ; i++) {
            for (int j = 0; j < twoDimArray[i].length; j++) {
                twoDimArray[i][j] = (char) ((Math.random() * 26)+ 96);
            }
        }
        return twoDimArray;
    }
    public static void createCharMatrixTest(){
        System.out.println("Созданние символьного двумерного массива: ");

        //пример1: вернет символьную матрицу
        try {
            char[][] twoDimArray = createCharMatrix(2,4);
            System.out.print("Пример 1:");
            System.out.println(Arrays.deepToString(twoDimArray));
        }
        catch (Exception exception){
            System.out.println(exception);
        }
        //пример2: вернет ошибку
        try {
            char[][] twoDimArray = createCharMatrix(1,4);
            System.out.println(Arrays.deepToString(twoDimArray));
        }
        catch (Exception exception){
            System.out.println(exception);
        }
    }
}
