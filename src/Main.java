public class Main {

    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
        task8();
        task9();
        task10();
        task11();
        task12();
        task13();
    }

    private static void task1() {
        System.out.println("Задача 1");
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }
    }

    private static void task2() {
        System.out.println("Задача 2");
        for (int i = 10; i >= 1; i--) {
            System.out.println(i);
        }
    }

    private static void task3() {
        System.out.println("Задача 3");
        for (int i = 0; i <= 17; i = i + 2) {
            System.out.println(i);

        }
    }

    private static void task4() {
        System.out.println("Задача 4");
        for (int i = 10; i >= -10; i--) {
            System.out.println(i);
        }
    }

    private static void task5() {
        System.out.println("Задача 5");
        for (int i = 1904; i <= 2096; i = i + 4) {
            if (i % 4 == 0 && i % 100 != 0 || i % 400 == 0) {
                System.out.println(i + " год является високосным");
            }
        }
    }

    private static void task6() {
        System.out.println("Задача 6");
        for (int i = 7; i <= 98; i = i + 7) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    private static void task7() {
        System.out.println("Задача 7");
        for (int i = 1; i <= 512; i = i * 2) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    private static void task8() {
        System.out.println("Задача 8");
        int accumulation = 29000;
        int total = 0;
        for (int i = 1; i <= 12; i++) {
            total = total + accumulation;
            System.out.println("Месяц " + i + " сумма накоплений равна " + total + " рублей");
        }
    }

    private static void task9() {
        System.out.println("Задача 9");
        double accumulation = 29000;
        double total = 0;
        for (int i = 1; i <= 12; i++) {
            total = total + total / 100;
            total = total + accumulation;
            System.out.println("Месяц " + i + " сумма накоплений равна " + total + " рублей");
        }
    }

    private static void task10() {
        System.out.println("Задача 10");
        int two = 2;
        int total = 0;
        for (int i = 1; i <= 10; i++) {
            total = i * two;
            System.out.println("2*" + i + "=" + total);
        }
    }


    private static void task11() {
        System.out.println("Задача 11");
        int total = 0;
        int accumulation = 15_000;
        while (total <= 2_459_000) {
            total = total + accumulation;
            System.out.println(total);
        }
    }

    private static void task12() {
        System.out.println("Задача 12");
        int number = 0;
        while (number < 10) {
            number = number + 1;
            System.out.print(number + " ");
        }
        System.out.println();
        number = 11;
        for (int i = 0; i < 10;i++) {
            number = number - 1;
            System.out.print(number + " ");
        }
        System.out.println();
    }



    private static void task13() {
        System.out.println("Задача 13");
        int population = 12_000_000;
        int birthrate = 17 * (population/1000);
        int deathRate = 8 * (population/1000);
        int populationIncrease = birthrate - deathRate;
        int year = 0;
        while (year < 10) {
            year = year + 1;
            population = population + populationIncrease;
            populationIncrease = populationIncrease + (population / 1000);
            System.out.println("Год " + year + ", численность населения составляет " + population);
        }
    }
}