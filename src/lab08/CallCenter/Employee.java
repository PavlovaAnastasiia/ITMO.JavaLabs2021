package lab08.CallCenter;

abstract public class Employee {
    private String rank;
    private String name;
    private boolean isBusy;

    public Employee(String name,String rank, boolean isBusy){
        this.name = name;
        this.rank = rank;
        this.isBusy = isBusy;
    }
    boolean isBusy(){

        return isBusy;
    }
    public void startCall(){

        isBusy = true;
        System.out.println("Спасибо, что воспользовались нашими услугами");
    }

    @Override
    public String toString() {

        return name;
    }

    public static class Director extends Employee{
        public Director(String name,String rank, boolean isBusy){

            super(name,rank,isBusy);
        }
    }
    public static class Manager extends Employee{
        public Manager (String name,String rank,boolean isBusy){

            super(name,rank,isBusy);
        }
    }
    public static class Operator extends Employee{
        public Operator (String name,String rank,boolean isBusy){

            super(name,rank,isBusy);
        }
    }
}
