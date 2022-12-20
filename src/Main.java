public class Main {
    public static void main(String[] args) {
//        task1();
//        task2();
//        task3();
//        task4();
//        task5();
        task6();
    }

    public static void task1() {
        System.out.println("Задача 1");
        int total = 0;
        int month = 0;
        while (total < 2_459_000) {
            total = total + 15_000;
            month = month + 1;
            System.out.println("Месяц " + month + " сумма накоплений равна " + total + " рублей");
        }
    }

    public static void task2() {
        System.out.println("Задача 2");
        int number = 0;
        while (number < 10) {
            number = number + 1;
            System.out.print(" " + number + " ");
        }
        System.out.println();

        for (int i = 10; i >= 1; i--) {
            System.out.print(" " + i + " ");
        }
    }

    public static void task3() {
        System.out.println("Задача 3");
        int population = 12_000_000;
        int fertility = (17 * 1_000) * 12;
        int mortality = (8 * 1_000) * 12;
        for (int i = 1; i <= 10; i++) {
            population = population + fertility - mortality;
            System.out.println("Год " + i + " численность населения составляет " + population + "");
        }
    }

    public static void task4() {
        System.out.println("Задача 4");
        int month = 0;
        int total = 15_000;
        while (total < 12_000_000) {
            total = total + (total * 7) / 100;
            month = month + 1;
            System.out.println("месяц " + month + " сумма накоплений " + total + "");
        }
    }

    public static void task5() {
        System.out.println("Задача 5");
        int month = 0;
        int total = 15_000;
        while (total < 12_000_000) {
            total = total + (total * 7) / 100;
            month = month + 1;
            if (month % 6 == 0) {
                System.out.println("месяц " + month + " сумма накоплений " + total + "");
            }
        }
    }

    public static void task6() {
        System.out.println("Задача 6");
        int month = 0;
        int totalMonth = 9 * 12;
        int contribution = 15_000;
        while (month <= totalMonth) {
            month = month + 1;
            contribution = contribution + (contribution * 7) / 100;
            if (month % 6 == 0) {
                System.out.println("месяц " + month + " сумма накоплений " + contribution + "");
            }
        }
    }
}