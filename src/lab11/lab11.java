package lab11;

import java.io.*;

public class lab11 {
    public static void main(String[] args) throws IOException {
        //task1: метод, который читает текстовый файл и возвращает его в виде списка строк.
        //readFileTest();

        //task2: метод, который записывает в файл строку, переданную параметром.
        //writeTextTest();

        //task3: используя решение 1 и 2, напишите метод, который склеивает два текстовый файла один.
        //mergeFiles();

        //task4: метод для копирования файла (побайтно, или массивами байт).
        copyTextByteText();

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
            fileWriter.close();
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

    public static boolean mergeFiles (String FileName,String FileName1,String FileName2){
        String text = readFile(FileName) + "\n" + readFile(FileName1);
        if (writeText(FileName2,text)){
            System.out.println("Текст записан в новый файл!");
            return true;
        }
        else {
            System.out.println("Текст не записан в новый файл, попробуйте снова.");
            return false;
        }
    }
    public static void mergeFiles(){
        mergeFiles("C:\\JavaLabsItmo\\src\\lab11\\text.file",
                "C:\\JavaLabsItmo\\src\\lab11\\textFile2","C:\\JavaLabsItmo\\src\\lab11\\NewFile");
    }
    public static void copyTextByte (String oldFile, String newFile) throws IOException {
        File file = new File(oldFile);
        File file1 = new File(newFile);

        //InputStream – это базовый класс для потоков ввода, т.е. чтения. Соответственно, он описывает базовые методы для работы с байтовыми потоками данных.
        //OutputStream - это класс в java.io пакет, который является базовым классом, представляющим поток bytes (stream of bytes) для записи bytes в файл.
        FileInputStream inputStream = new FileInputStream(file);
        FileOutputStream outputStream = new FileOutputStream(file1);

        int read;
        while ((read = inputStream.read()) != -1){ // Вызов метода read () для чтения текстового содержимого побайтно в read
            outputStream.write(read); // Вызов метода записи для вывода байта за байтом в целевой файл
        }
        inputStream.close();
        outputStream.close();
    }
    public static void copyTextByteText() throws IOException {
       copyTextByte("C:\\JavaLabsItmo\\src\\lab11\\NewFile", "C:\\JavaLabsItmo\\src\\lab11\\newFile1");
       System.out.println("Текст был скопирован в новый файл!");
    }
}
