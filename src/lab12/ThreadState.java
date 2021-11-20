package lab12;

class ThreadState implements Runnable {
    Thread myThread;

    public ThreadState(String ThreadName) {
        myThread = new Thread(this, ThreadName);

        // Поток еще не запущен, вывести состояние потока
        Thread.State ts = myThread.getState();
        System.out.println("Состояние " + Thread.currentThread().getName() + " в конструкторе: " +  lab12.threadState(ts));

        myThread.start();
    }
    @Override
    public void run() {
        Thread.State ts = myThread.getState();
        System.out.println("Состояние потока в методе run(): " + lab12.threadState(ts));
    }
}
