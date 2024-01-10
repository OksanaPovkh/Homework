package util.Scanner;

public class MainCalories {
    private static final double CALORIES_PER_CM2 = 10;

    public static void main(String[] args) {
        int r1 = 12;
        int r2 = 14;
        final int CALORIES_PER_CM = 40;

        double s1 = Math.PI * r1 * r1;
        double s2 = Math.PI * r2 * r2;

        int calories1 = (int) (s1 * CALORIES_PER_CM2);
        int calories2 = (int) (s2 * CALORIES_PER_CM2);

        System.out.println("Дополнительные калории:" + (calories2 - calories1));
    }
}
