package lab11;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class lab11 {
    public static void main(String[] args){
        //task1: метод, который читает текстовый файл и возвращает его в виде списка строк.
        //readFileTest();
        //task2: метод, который записывает в файл строку, переданную параметром.
        writeTextTest();
        //task3: используя решение 1 и 2, напишите метод, который склеивает два текстовый файла один.

        //task4: метод для копирования файла (побайтно, или массивами байт).

        //task5:  метод, который в каталоге ищет текстовые файлы, в которых содержится определенная строка,
        // и которая возвращает список имен таких файлов. (FilenameFilter)
    }

    public static String readFile(String fileName) {
        //File file = new File("C:\\JavaLabsItmo\\src\\lab11\\text.file");
        //System.out.println("Файл может быть прочитан: ");
        //System.out.print(file.canRead());

        String textRead = "";

       try(FileReader reader = new FileReader(fileName)){
            int c;
           while((c = (reader.read()))!=-1){ // посимвольное чтение
               textRead += (char)c;
           }
       }
       catch (IOException exception) {

           System.out.println(exception.getMessage());
       }
        System.out.println(textRead);
        return textRead;
    }
    public static void readFileTest(){
        String readText = readFile("C:\\JavaLabsItmo\\src\\lab11\\text.file");
        System.out.println("\n Текст из файла: " + readText);
    }

    public static boolean writeText(String FileName, String data){
        File file = new File(FileName);
        FileWriter fileWriter = null;
        try {
            fileWriter = new FileWriter(file);
            fileWriter.write(data); //запись строки в буфер
            fileWriter.flush(); //запись из буфера в файл
        }
        catch (IOException exception){
            System.out.println(exception.getMessage());
        }
        return true;
    }
    public static void writeTextTest(){
        if (writeText("C:\\JavaLabsItmo\\src\\lab11\\textFile2","Метод flush() используется, чтобы принудительно записать" +
                "\n в целевой поток данные, которые могут кэшироваться в текущем потоке." +
                "\n Актуально при использовании буферизации и/или нескольких объектах потоков, организованных в цепочку."));
            System.out.println("Данные были дбавлены!");
    }
}
