package Lesson_1.Number3;

public class Triangle extends Figure{
    void form() {
        System.out.println("Form of circle is triangular");
    }

    @Override
    void size() {
        System.out.println("Size of triangle is middle");
    }

    public static void main(String[] args) {
        Figure t = new Triangle();
        t.color();
        t.form();
        t.size();
    }
}
