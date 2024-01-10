package util.Scanner2;

public class Main3 {

    public static double euroToDollar(double euro) {
        return euro * 1.15;
    }

    public static void main(String[] args) {
        double euro = 100.0;
        double dollar = euroToDollar(euro);
        System.out.println(euro + " евро = " + dollar + " долларов США");
    }
}
