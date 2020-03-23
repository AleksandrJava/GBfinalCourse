package Lesson_1.Number3;

public class Circle extends Figure {
    void color(){
        System.out.println("Color of circle is blue");
    }

    void form() {
        System.out.println("Form of circle is round");
    }

    public static void main(String[] args) {
        Figure c = new Circle();
        c.color();
        c.form();
    }
}
