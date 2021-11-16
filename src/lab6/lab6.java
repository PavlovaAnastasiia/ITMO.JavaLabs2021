package lab6;

public class lab6 {
    public static void main(String[] args) {

        //task2:
        Home home = new Home(10, 1979, "Брежневка" );
        System.out.println(home);
        System.out.println("С момента постройки " +
                home.countYearsFromConstruction() + " лет");

        //task3:
        Tree tree = new Tree();
        System.out.println(tree);
        Tree tree1 = new Tree(12,"birch");
        System.out.println(tree1);
        Tree tree2 = new Tree (1, "oak",true);
        System.out.println(tree2);

        //task4
        Plane.Wing plane1 = new Plane.Wing(98.0);
        System.out.println(plane1);
    }
}
