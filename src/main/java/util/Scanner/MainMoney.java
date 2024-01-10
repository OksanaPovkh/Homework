package util.Scanner;

public class MainMoney {
    public static double eurosToDollars(double euros) {
        return euros * 1.05;
    }

    public static void main(String[] args) {

        double euros = 100;
        double dollars = eurosToDollars(euros);



        System.out.println(euros + "евро = " + dollars + " долларов США");
    }
}
