package Lesson_1.Number1;

public class Main {
    public static void main(String[] args) {
        Person c = new Person.Builder().addFirstName("Alex").addLastName("Popov").addCountry("Russia").build();
        System.out.println(c.getLastName());

    }

}
