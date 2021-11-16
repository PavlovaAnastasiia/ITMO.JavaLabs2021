package lab5;

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
        //task2: вычисление длины вектора
        //vectLength(1,2,3);

        //task3:расчет скалярного произведения
        //System.out.println(scalarMult());
    }

    public static void vectLength(int x, int y, int z){
        double length = Math.sqrt(x*x + y*y + z*z);
        System.out.println("Длина вектора: " + length);
    }

    public static int scalarMult(){
        Vector vector1 = new Vector(1,2,2);
        Vector vector2 = new Vector(2,4,7);
        int multiplication = vector1.x* vector2.x + vector1.y* vector2.y + vector1.z* vector2.z;
        return multiplication;
    }
    
}
