package lab10;

import java.util.HashSet;
import java.util.Set;

public class lab10 {
    public static void main(String[] args){
        //task1: на входе получает коллекцию объектов, а возвращает коллекцию уже без дубликатов
        returnNoDuplicates();
    }
    public static void returnNoDuplicates (){

        //хотела оформить ввод данных через Scanner, но не получилось
        /* List<String> stringList = new ArrayList<>();
        System.out.println("Пожалуйста, напишите слова для проверки: ");
        Scanner sc = new Scanner(System.in);
        do {
            stringList = Collections.singletonList(sc.nextLine());
            System.out.println(stringList);
        } while (!stringList.equals("конец"));
        sc.close();*/

        Set<String> stringList = new HashSet<>();
        stringList.add("кот");
        stringList.add("собака");
        stringList.add("лошадь");
        stringList.add("хомяк");
        System.out.println("В начальном списке присутсвуют слова: " + stringList);

        Set<String> stringList1 = new HashSet<>(stringList);

        stringList1.add("кошка");
        stringList1.add("кот");
        stringList1.add("мышка");

        stringList.removeAll(stringList1);
        System.out.println("В конечном списке присутсвуют слова: " + stringList1);
    }
}
