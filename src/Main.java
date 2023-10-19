public class Main {
    public static void main(String[] args) {
        ;
// TASK_1
        System.out.println("Задача № 1");
        int clientOS = 1;
        switch (clientOS) {
            case 0:
                System.out.println("Установите версию приложения для iOS по ссылке");
                break;
            case 1:
                System.out.println("Установите версию приложения для Android по ссылке");
                break;
            default:
                System.out.println("Проверьте вводные данные");
        }

// TASK_2
        System.out.println("Задача № 2");
        int clientDeviceYear = 2014;
        int clientOs = 1;
        if (clientDeviceYear < 2015 && clientOs == 0) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        } else if (clientDeviceYear < 2015 && clientOs == 1) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        } else if (clientDeviceYear >= 2015 && clientOs == 0) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else if (clientDeviceYear >= 2015 && clientOs == 1) {
            System.out.println("Установите версию приложения для Android по ссылке");
        } else {
            System.out.println("Вводные данные невалидны");
        }

// TASK_3
        System.out.println("Задача № 3");
        int year = 1589;
        if (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0)) {
            System.out.println("Год високосный");
        } else {
            System.out.println("Год не високосный");
        }
        if (year < 1584) {
            System.out.println("До 1584 г. понятия високосного года не существовало");
        }

// TASK_4
        System.out.println("Задача № 4");
        int deliveryDistance = 150;
        int days = 0;
        if (deliveryDistance <= 20) {
            days = 1;
        }
        if (deliveryDistance > 20 && deliveryDistance <= 60) {
            days = 2;
        }
        if (deliveryDistance > 60 && deliveryDistance <= 100) {
            days = 3;
        }
        if (deliveryDistance > 100) {
            System.out.println("Доставка не выполняется");
        }
        System.out.println("Потребуется дней: " + days);

// TASK_5
        System.out.println("Задача № 5");
        int monthNumber = 15;
        switch (monthNumber) {
            case 12:
            case 1:
            case 2:
                System.out.println("Зима");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Весна");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Лето");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("Осень");
                break;
            default:
                System.out.println("Камон, в году всего 12 месяцев, *рукалицо*");
        }
    }
}