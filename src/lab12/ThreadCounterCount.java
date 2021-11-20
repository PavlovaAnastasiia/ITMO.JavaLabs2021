package lab12;

public class ThreadCounterCount extends Thread{
    Counter counter;

    public ThreadCounterCount (String name){
        super(name);
        //this.counter = counter;
    }
    public void run(){
        System.out.println("Поток " + Thread.currentThread().getName() + " запущен!");
        for (int i = 1; i<1001; i++){
            counter.increment();
        }
    }
}
