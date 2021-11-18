package lab04;

import java.util.Scanner;

public class lab4 {
    public static void main(String[] args){
        //task1: поиск самой длинной строки
        //longestLine();

        //tak2: является ли слово полиндромом
        /*Scanner sc = new Scanner(System.in);
        System.out.println("Введите слово: ");
        String  word = sc.next();
        isPalindrome1(word);*/

        //task3:заменяет в тексте слово "бяка"
        //Censorship();

        //task4: найти количество вхождений одной (являющейся подстрокой) в другую
        //countRepeat();

        //task5: инвертировать слова в строке
        String text = "Sample Output: \n" +
                "The given string is: This is a test string \n" +
                "The string reversed word by word is: \n" +
                "sihT si a tset gnirts";
        invertSent(text);
        //нормально ли, что метод читает строки с конца, тем самым меняет их месстами?
    }
    public static void longestLine(){
        String[] words = {"кот","собака","мышь","хомяк"};
        int longestString = 0;
        for (int i = 0; i<words.length; i++){
            if (words[i].length()>longestString) {
                longestString = words[i].length();
            }
        }
        for (int i = 0; i<words.length; i++){
            if(words[i].length()==longestString){
                System.out.println(words[i]);
            }
        }
    }
    public static void isPalindrome1(String word){
        String reverse = "";
        for (int i = word.length()-1; i >= 0; i--){
            reverse = reverse + word.charAt(i); //возвращает символ, расположенный по указанному индексу строки
        }
        if(word.equals(reverse)){ //сравнивает строку с указанным объектом
            System.out.println("Слово - палиндром");
        }
        else{
            System.out.println("Слово не яляется палиндромом");
        }
    }
    public static void Censorship(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите предложение: ");
        String  sentence = sc.nextLine();
        String bakaCensorship = sentence.replace("бяка", "[вырезано цензурой]");
        System.out.println(bakaCensorship);
    }
    public static void countRepeat(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите два предложения: ");
        String sentence1 = sc.nextLine();
        String sentence2 = sc.nextLine();

        int count = 0;
        for (int i = 0; i<= sentence1.length() - sentence2.length(); i++){
            String substring = sentence1.substring(i, i + sentence2.length()); //.substring возвращает новую строку, которая является подстрокой данной стоки
            if (substring.equals(sentence2)){
                count += 1;
            }
        }
        System.out.println("Количество вхождений: " + count);
    }
    public static void invertSent (String text){
        StringBuffer buffer = new StringBuffer(text);
        buffer.reverse();
        System.out.println(buffer);
    }
}
