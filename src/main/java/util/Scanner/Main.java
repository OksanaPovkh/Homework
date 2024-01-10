package util.Scanner;

public class Main {



    public static int add(int a, int b){
        return a + b;
    }

    public static int subtract(int a, int b){
        return a - b;
    }

    public static int multiply(int a, int b){
        return a * b;
    }

    public static float divide(int a, int b){
        return (float) a / b;
    }

    public static void main(String[] args) {
        int a = 10;
        int b = 5;


        System.out.println(add(a, b));
        System.out.println(subtract(a, b));
        System.out.println(multiply(a, b));
        System.out.println(divide(a, b));
    }
    }
