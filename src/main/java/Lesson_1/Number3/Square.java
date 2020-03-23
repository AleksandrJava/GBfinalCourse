package Lesson_1.Number3;

public class Square extends Figure {
    void color(){
        System.out.println("Color of square is white");
    }

    void form() {
        System.out.println("Form of square is square ");
    }

    @Override
    void size() {
        System.out.println("Size of square is small");
    }

    public static void main(String[] args) {
        Figure s = new Square();
        s.color();
        s.form();
        s.size();
    }
}
