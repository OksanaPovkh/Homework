package util.Scanner2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите первое слово:");
        String word1 = scanner.next();

        System.out.println("Введите второе слово:");
        String word2 = scanner.next();

        if (word1.length() % 2 == 0 && word2.length() % 2 == 0) {
            String result = word1.substring(0, word1.length()/2) + word2.substring(word2.length()/2);
            System.out.println(result);
        }else {
            System.out.println("Слова должны состоять из четного количества букв");
        }
    }
}
