package lab7.task2;

public class Box extends Shape{
    double shapeBoxVolume = 0; //текущий занятый объем в коробке

    public Box (double volume){
        super(volume);
    }

    @Override
    public String ToString() {
        return null;
    }

    public boolean Add (Shape shape) {

        this.shapeBoxVolume += shape.getVolume(); //новая фигура занимает объем в коробке
        if (this.volume <= this.shapeBoxVolume) {
            this.shapeBoxVolume -= shape.getVolume(); //если объем коробки меньше, чем ее объем до добавления последней фигуры,
            return false; //то фигура не помещается, и мы ее убираем
        }
        else{
            this.shapeBoxVolume += shape.getVolume();
            return true;
        }
    }
}
