package Lesson_1.Number2;

class LightWeightCar extends Car implements Moveable{

    public LightWeightCar(Engine engine, String color, String name) {
        super(engine, color, name);
    }

    @Override
    public void move() {
        System.out.println("Car is moving");
    }

}
