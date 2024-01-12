package Homework;

public class Pensioner extends Person {
    double pensioner;

    public Pensioner(String name, int age, double height, double weight) {
        super(name, age, height, weight);
    }

    public Pensioner(int money) {
        super(money);
    }

    @Override
    public void die(int age) {


        int pension = 0;
        System.out.println("Этот пенсионер умерб он заработал: " + (age - 50) * pension);
        }



    }



