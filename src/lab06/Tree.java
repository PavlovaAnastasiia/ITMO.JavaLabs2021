package lab06;

public class Tree {

    int age;
    boolean alive;
    String name;

    public Tree (int age, String name){
        this.age = age;
        this.name = name;
    }

    public Tree (int age, String name,boolean alive){
        this.age = age;
        this.name = name;
        this.alive = alive;
    }

    public Tree(){
        System.out.println("Пустой конструктор без параметров сработал");
    }
    @Override //пустой конструктор тоже выдает значения
    public String toString() {
        return "Информация: дерево " + name + "(возраст: " + age + " лет; " +
                ((alive) ? ";живое" : "мертвое") + ')';
    }
}
