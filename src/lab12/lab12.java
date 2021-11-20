package lab12;

public class lab12 {
    public static void main(String[] args){
        //task1: Напишите программу, в которой запускается 10 потоков и каждый из них выводит
        //числа от 0 до 100.
        //for (int i=1; i<11;i++){
        //    new RunTenThreads("номер "+i).start();}

        //task2: Выведете состояние потока перед его запуском, после запуска и во время выполнения.
        //ThreadState threadState1 = new ThreadState("пример потока");

        Thread thread = Thread.currentThread();
        try {
            Thread.sleep(3000);
            System.out.println("Состояние потока после вызова sleep(): " + lab12.threadState(thread.getState()));
        }
        catch (InterruptedException e) {
            e.printStackTrace();
        }

        //task3: Напишите программу, в которой запускается 100 потоков, каждый из которых
        //вызывает метод increment() 1000 раз.
        //После того, как потоки завершат работу, проверьте, чему равен count .
        //Если обнаружилась проблема, предложите ее решение.

        //task4: Напишите программу, в которой создаются два потока, каждый из которых выводит
        //по очереди на консоль своё имя.
        //Начать можно с написания своего класс-потока, который выводит в бесконечном
        //цикле свое имя. Потом придется добавить синхронизацию с помощью wait() и notify().

    }

    static class RunTenThreads extends Thread {
        RunTenThreads(String name){
            super(name);
        }

        public void run(){
            System.out.println("Поток под именем " + Thread.currentThread().getName() + " был запущен!");
            for (int i = 0; 1<101; i++){ //выводит числа от 0 до 100
                try {
                    sleep(1500);
                }
                catch (Exception exception){}
            }
        }
    }

    //task2:
    public static String threadState (Thread.State ts) {

        //обработка состояния
        if (ts == Thread.State.NEW) {
            return "Поток создан, но не запущен.";
        } if (ts == Thread.State.RUNNABLE) {
            return "Поток выполняется.";
        } if (ts == Thread.State.BLOCKED) {
            return "Поток приостановлен.";
        }
        if (ts == Thread.State.TIMED_WAITING){
            return "TIMED_WAITING";
        }
        return "WAITING";
    }
}

