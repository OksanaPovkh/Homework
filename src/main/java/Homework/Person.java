package Homework;

public abstract class Person {

    private String name;
    private int age;
    private double height;
    private double weight;

    private double die;

    public void die(){
        System.out.println("Человек погиб");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if(age < 0) {
            throw new IllegalArgumentException("Возраст не может быть отрицательным");
        }
        this.age = age;
    }



    public Person(String name, int age, double height, double weight) {
        this.name = name;
        this.age = age;
        this.height = height;
        this.weight = weight;
    }
    public void info(){
        System.out.println("Меня зовут" + ". Мне " + this.age + " лет. Мой рост " + this.height + ". Мой вес " + this.weight);

    }

    public void goToWork(){
        if ( this.age < 18 || this.age > 70) {
            System.out.println("Я отдыхаю дома");
        } else {
            System.out.println("Я работаю");
        }
    }

    public Person(int money) {
    }

    public abstract void die(int age);
}
