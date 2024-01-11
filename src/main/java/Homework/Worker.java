package Homework;

public class Worker extends Person {


    int minSalary;
    int maxSalary;

    public Worker(String name, int age, double height, double weight) {
        super(name, age, height, weight);
    }

    public Worker(int money) {
        super(money);
    }

    //@Override
    public void die(int age) {
        System.out.println(" Этот человек не дожил до пенсии");
    }
}
