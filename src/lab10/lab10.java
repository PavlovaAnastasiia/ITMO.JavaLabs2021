package lab10;

import java.util.*;

public class lab10 {
    public static void main(String[] args){
        //task1: на входе получает коллекцию объектов, а возвращает коллекцию уже без дубликатов
        returnNoDuplicates();

        //task2: Напишите метод, который добавляет 1млн элементов в ArrayList и LinkedList.
        // Напишите метод, который выбирает из заполненного списка элемент наугад 10000 раз.
        // Замерьте время, которое потрачено на это. Сравните результаты, предположите, почему они именно такие.
        System.out.println(add1MilElements());
        chooseElements();

        //task4: Метод получает на вход массив элементов типа К. Вернуть нужно объект Map<K, Integer>, где K — Значение из массива, а Integer
        //количество вхождений в массив: <K> Map<K, Integer> arrayToMap(K[] ks);
        Integer[] array = {1, 2, 1, 1, 5, 7, 2, 5};
        Map<Integer, Integer> map =  arrayToMap(array);
        System.out.println(map);

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
    public static String add1MilElements(){
        ArrayList<Integer> arrayList = new ArrayList<>();
        LinkedList<Integer> linkedList = new LinkedList<>();

        int quantityElements = 1000000;
        for (int i = 0; i < quantityElements; i++) {
            arrayList.add((int) Math.random());
            linkedList.add((int) Math.random());
        }
        return "Элементы были добавлены";
    }
    public static void chooseElements(){
        ArrayList<Double> arrayList = new ArrayList<>();
        LinkedList<Double> linkedList = new LinkedList<>();

        final int quantityElements = 1000000;
        for (int i = 0; i < quantityElements; i++) {
            arrayList.add(Math.random());
            linkedList.add(Math.random());
        }
        System.out.println("Элементы были добавлены");

        final int chooseTimes = 10000;
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < chooseTimes; i++) {
            arrayList.get((int) (Math.random() * (quantityElements - 1)));
        }
        long finish = System.currentTimeMillis();
        long totalTime = finish - startTime;
        System.out.println("При добавлении в ArrayList было занято времени: " + totalTime);

        long startTime1 = System.currentTimeMillis();
        for (int i = 0; i < chooseTimes; i++) {
            linkedList.get((int) (Math.random() * (quantityElements - 1)));
        }
        long finish1 = System.currentTimeMillis();
        long totalTime1 = finish1 - startTime1;
        System.out.println("При добавлении в LinkedList было занято времени: " + totalTime1);
        System.out.println("Предполагаю, что добавление в LinkedList заняло значительно больше времени, так как " +
                "\n каждый объект, помещенный в связанный список, является узлом." +
                "\n Каждый узел содержит элемент, ссылку на предыдущий и следующий узел. ");
    }

    public static <K> Map<K, Integer> arrayToMap(K[] array) {

        Map<K, Integer> map = new HashMap<>();
        for (int i = 0; i < array.length; i++) {
            if (map.containsKey(array[i])) { //проверяет наличие какого-то ключа
                int temp = map.get(array[i]) +1;
                map.put(array[i], temp);
            }
            else {
                map.put(array[i], 1);
            }
        }
        return map;
    }
}
