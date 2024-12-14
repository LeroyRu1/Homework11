public class Main {
    public static void main(String[] args) {

        int year = 1584;
        calculateLeapYear(year);


        String device = calculateDevice(1);
        int deviceYear = 2014;
        if (deviceYear < 2015) {
            System.out.println("Установите облегченную версию приложения для " + device + " по ссылке");
        } else {
            System.out.println("Установите версию приложения для " + device + " по ссылке");
        }


        int days = calculateDays(20);
        if (days != 0) {
            System.out.println("Потребуется дней для доставки " + days);
        } else {
            System.out.println("Доставка невозможна");
        }

    }

    public static void calculateLeapYear(int year) {
        if (year > 1584 && ((year % 400 == 0) || (year % 4 == 0 && year % 100 != 0))) {
            System.out.println(year + " год високосный");
        } else {
            System.out.println(year + " год не вискоксный");
        }

    }

    public static String calculateDevice(int device) {
        if (device == 0) {
            return "IOS";
        } else {
            return "Android";
        }

    }


    public static int calculateDays(int distance) {
        int days = 0;
        if (distance <= 20) {
            return 1;
        }
        if (distance > 20 && distance <= 60) {
            return 2;
        }
        if (distance > 60 && distance <= 100) {
            return 3;
        } else return days;
    }

}