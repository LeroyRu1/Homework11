import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        int year = 1584;
        calculateLeapYear(year);

        getDevice(1, 2024);

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

    public static void getDevice (int device, int year) {
        int currentYear = LocalDate.now().getYear();
        if (device == 0 && year < currentYear) {
            System.out.println("Установите облегченную версию приложения для IOS по ссылке");
        } else if (device == 0 && year >= currentYear) {
            System.out.println("Установите версию приложения для IOS по ссылке");
        } else if (device == 1 && year < currentYear) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        } else {
            System.out.println("Установите версию приложения для Android по ссылке");
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