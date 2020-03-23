package Lesson_1.Number2;


//Интерфейсы не наследуются, а реализуются
class Lorry extends Car implements Moveable, Stopable{

    public Lorry(Engine engine, String color, String name) {
        super(engine, color, name);
    }

    @Override
    public void move(){
        System.out.println("Car is moving");
    }

    @Override
    public void stop(){
        System.out.println("Car is stop");
    }
}

