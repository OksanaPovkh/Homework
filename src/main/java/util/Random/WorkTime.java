package util.Random;

import java.util.Random;

public class WorkTime {
    public static void main(String[] args) {
        Random rand = new Random();
        int secondsLeft = rand.nextInt(28801);

        System.out.println(secondsLeft);

        int hoursLeft = secondsLeft / 3600;

        if (hoursLeft == 0) {
            System.out.println("Осталось менее часа");
        } else {
            if (hoursLeft == 1) {
                System.out.println("Остался 1 час");
            } else {
                if (hoursLeft <= 4) {
                    System.out.println("Осталось" + hoursLeft + "часа");
                }else  {
                    System.out.println("Осталось" + hoursLeft + "часа");
                }
            }
        }
    }
}
