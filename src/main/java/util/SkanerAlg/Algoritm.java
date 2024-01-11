package util.SkanerAlg;

import java.util.Scanner;

public class Algoritm {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Выведите 1 чмсло: ");
        int A = scanner.nextInt();

        System.out.println("Выведите 2 чмсло: ");
        int B = scanner.nextInt();

        System.out.println("Выведите 3 чмсло: ");
        int C = scanner.nextInt();

        int sum = A + B + C;

        System.out.println("Сумма чисел: " + sum);

    }
}
