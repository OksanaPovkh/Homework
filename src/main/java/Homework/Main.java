package Homework;

public class Main {
    public static void main(String[] args) {
        Person person1 = new Person("John", 25, 180, 80);
        Person person2 = new Person("Mary", 35, 165, 55);

        person1.info();
        person1.goToWork();

        person2.info();
        person2.goToWork();
    }
}
