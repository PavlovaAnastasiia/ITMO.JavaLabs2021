package Lab12;

public class TwoThreads extends Thread{
    // общий для двух потоков lock
    private Object lock;

    public TwoThreads(String name, Object object) {
        super(name);
        this.lock = object;
    }

    @Override
    public void run() {
        while (true) {
            synchronized (lock) {
                try {
                    System.out.println(getName());
                    lock.notify(); //возобновляет работу потока, который вызвал wait()
                    lock.wait(); //поток, в котором произошел вызов такого метода будет ждать, пока какой-то другой поток не вызовет метод notify()
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}


