package lab5;

import java.util.Random;

public class Vector { //описывает вектор в трехмерном пространстве

    int x;
    int y;
    int z;

    //конструктор
    public Vector(int x, int y, int z){
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public static void main(String[] args) {
        Vector vector1 = new Vector(1,2,2);
        Vector vector2 = new Vector(2,4,7);
        //task2: вычисление длины вектора
        vectLength(vector1);

        //task3:расчет скалярного произведения
        System.out.println(scalarMult(vector1, vector2));

        //task4: векторное произведение с другим вектором
        Vector.twoVectMult(vector1, vector2);

        //task5: косинус угла между векторами
        cosCorner(vector1,vector2);

        //task6: метод для суммы и разности
        SumNeg(vector1,vector2);

    }

    public static double vectLength(Vector vector1){

        double length = Math.sqrt(vector1.x*vector1.x + vector1.y*vector1.y + vector1.z*vector1.z);
        System.out.println("Длина вектора: " + length);
        return length;
    }

    public static int scalarMult(Vector vector1, Vector vector2){
        int multiplication = vector1.x* vector2.x + vector1.y* vector2.y + vector1.z* vector2.z;
        return multiplication;
    }
    public static void twoVectMult(Vector vector1, Vector vector2){

        int mult1 = vector1.y*vector2.z - vector1.z* vector2.y;
        int mult2 = vector1.z* vector2.x - vector1.x* vector2.z;
        int mult3 = vector1.x* vector2.y - vector1.y* vector2.x;
        System.out.println("("+ mult1 + ", "+mult2+ ", " +mult3 + ")");
    }
    public static void cosCorner(Vector vector1, Vector vector2) {
        double a = scalarMult(vector1, vector2) / (vectLength(vector1) * vectLength(vector2));
        System.out.println(a);
    }
    public static void SumNeg (Vector vector1, Vector vector2){
        int a = vector1.x + vector2.x;
        int b = vector1.y + vector2.y;
        int c = vector1.z + vector2.z;
        int a1 = vector1.x - vector2.x;
        int b1 = vector1.y - vector2.y;
        int c1 = vector1.z - vector2.z;

        System.out.println("Сумма: (" + a + "," + b + "," + c + ")");
        System.out.println("Разность: (" + a1 + "," + b1 + "," + c1 + ")");
    }
}
