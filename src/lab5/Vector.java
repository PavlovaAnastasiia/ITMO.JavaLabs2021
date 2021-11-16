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

        //task4: векторное произведение с другим вектором
        //twoVectMult();
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
    public static void twoVectMult(){
        Vector vector1 = new Vector(1,2,2);
        Vector vector2 = new Vector(2,4,7);

        int mult1 = vector1.y*vector2.z - vector1.z* vector2.y;
        int mult2 = vector1.z* vector2.x - vector1.x* vector2.z;
        int mult3 = vector1.x* vector2.y - vector1.y* vector2.x;
        System.out.println("("+ mult1 + ", "+mult2+ ", " +mult3 + ")");
    }
    public static
}
