package Lesson_1.Number2;

public interface Stopable{
        default void stop(){
                System.out.println("Stop car");
        };
}
