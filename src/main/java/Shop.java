public class Shop {
    public static void main(String[] args) {

        boolean isWeekend = true;
        boolean isRain = false;

        boolean canWalk = isWeekend  && !isRain;

        System.out.println("Можно ли прогуляться:" + canWalk);

        boolean isEdekaOpen = true;
        boolean isReweopen = false;

        System.out.println("Я могу купить еду:" + canBuy(isEdekaOpen, isReweopen));

    int temperature1 = 110;
    int temperature2 = 90;

        System.out.println(checkDevice(temperature1, temperature2));
    }

    public static boolean canBuy(boolean isEdekaOpen, boolean isReweOpen){
        return isEdekaOpen || isReweOpen;
    }

    public static boolean checkDevice(int temp1, int temp2) {
        return temp1 > 100 && temp2 < 100;
    }
}
