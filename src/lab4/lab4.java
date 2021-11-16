package lab4;

public class lab4 {
    public static void main(String[] args){
        //task1: поиск самой длинной строки
        longestLine();

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
}
