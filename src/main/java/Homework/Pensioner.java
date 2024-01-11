package Homework;

public class Pensioner extends Person {
    double pensioner;

    public Pensioner(String name, int age, double height, double weight) {
        super(name, age, height, weight);

        //@Override
        public void die(int pension) {

            System.out.println("Этот пенсионер умерб он заработал: " + (age - 50) * pension);
        }

    }

    public static class Worker extends Person {

        public Worker(String name, int age, double height, double weight) {
            super(name, age, height, weight);

            int minSalary;
            int maxSalary;

            //@Override
            public void die(int pension) {
                System.out.println(" Этот человек не дожил до пенсии");
            }
        }
    }
}


