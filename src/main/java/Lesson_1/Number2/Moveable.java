package Lesson_1.Number2;

public interface Moveable {
    default void move(){
        System.out.println("Car is moving");
    };
}
