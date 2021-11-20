package Lab12;

public class ThreadCounterCount extends Thread{
    //task3
    Counter counter;

    public ThreadCounterCount (String name){
        super(name);
        //this.counter = counter;
    }
    public void run(){
        for (int i = 1; i<1001; i++){ //реализация increment() в потоке
            counter.increment();
        }
        System.out.println(counter.getCount());
    }
}
