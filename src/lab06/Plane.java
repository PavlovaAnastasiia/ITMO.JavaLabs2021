package lab06;

public class Plane {

    static class Wing{
        double weight;

        public Wing (double weight){
            this.weight = weight;
        }

        @Override
        public String toString(){
            return "Вес самолета равен " + weight + " тоннам";
        }
    }
}
