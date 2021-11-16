package lab4;

import java.util.Scanner;

public class lab4 {
    public static void main(String[] args){
        //task1: поиск самой длинной строки
        //longestLine();

        //tak2: является ли слово полиндромом
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите слово: ");
        String  word = sc.next();
        isPalindrome1(word);

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
            reverse = reverse + word.charAt(i); //возвращает символ, расположенный рл указанному индексу строки
        }
        if(word.equals(reverse)){
            System.out.println("Слово - палиндром");
        }
        else{
            System.out.println("Слово не яляется палиндромом");
        }
    }
}
