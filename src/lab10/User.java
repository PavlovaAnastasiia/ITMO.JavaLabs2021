package lab10;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class User {
    private String name;

    //Alt+Insert
    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
    public static void main(String[] args){
        findPointQuantity1();
    }

    public static void findPointQuantity(){
        //немного пришлось изменить суть, так как get() не хотел принимать String
        Map<Integer, String> users = new HashMap<>();
        users.put(1, "Катя, 30 очков");
        users.put(2, "Игорь, 10 очков");
        users.put(3, "Настя, 50 очков");
        users.put(4, "Коля, 15 очков");

        Scanner scanner = new Scanner(System.in);
        System.out.println("Напишите индекс пользователя, чтобы узнать количество очков: ");
        int index1;
        index1 = scanner.nextInt();
        String element1 = users.get(index1);
        System.out.println(element1);

        //for(String name1 : users.keySet()){
        //    System.out.println(name);
        //}
    }
    public static void findPointQuantity1(){
        //все-таки получилось
        Map<String, Integer> user = Map.of(
                "Bob", 18,
                "James", 20,
                "Katy", 13);
        Scanner scanner = new Scanner(System.in);
        System.out.println("Напишите имя пользователя, чтобы узнать количество очков: ");
        String name1 = scanner.nextLine();
        Integer element1 = user.get(name1);
        System.out.println(element1);
    }
}



