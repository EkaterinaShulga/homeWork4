package ru.skypro;

public class Main {

    public static void main(String[] args) {
        //tasks 1,2

        int clientOS = 0;
        int clientDeviceYear = 2016;

        if (clientOS == 0) {
            System.out.println("Установите версию приложения для iOS по ссылке.");
            if (clientDeviceYear >= 2015) {
                System.out.println("Приложение будет работать корректно.");
            } else
                System.out.println("Установите облегченную версию приложения для iOS по ссылке.");
        }
        if (clientOS == 1) {
            System.out.println("Установите версию приложения для Android по ссылке.");
            if (clientDeviceYear >= 2015) {
                System.out.println("Приложение будет работать корректно.");
            } else
                System.out.println("Установите облегченную версию приложения для Android по ссылке.");
        }


        //task 3

        int year = 2014;

        if (year % 4 == 0) {
            System.out.println(year + " год является високосным.");
        } else if (year % 100 == 0 && year % 400 == 0) {
            System.out.println(year + " год является високосным.");
        } else {
            System.out.println(year + " год не является високосным.");

        }

        //task 4
        int deliveryDistance = 120;
        int days = deliveryDistance / 40 + 1;
        if (deliveryDistance <= 20) {
            System.out.println("Потребуются сутки");
        } else {
            System.out.println("Потребуется дней: " + days);
        }

        //task 5
        int monthNumber = 10;
        switch (monthNumber) {
            case 12:
            case 1:
            case 2:
                System.out.println("Зима.");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Весна.");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Лето.");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("Осень.");
                break;
            default:
                System.out.print("Месяца с таким номером нет.");
        }
        System.out.println(" ");

        //additional tasks
        //tasks 6

        int age = 19;
        int salary = 58_000;

        if (age >= 23) {
            int limitOne = salary * 3;
            if (salary >= 50000) {
                limitOne = limitOne + ((limitOne * 120) / 100);
                System.out.println("Мы готовы выдать вам кредитную карту с лимитом: " + limitOne + " рублей.");
            } else if (salary >= 80000) {
                limitOne = ((limitOne * 150) / 100) + limitOne;
                System.out.println("Мы готовы выдать вам кредитную карту с лимитом: " + limitOne + " рублей.");
            } else {
                System.out.println("Мы готовы выдать вам кредитную карту с лимитом: " + limitOne + " рублей.");
            }
        }

        if (age < 23) {
            int limitTwo = salary * 2;
            if (salary >= 50000) {
                limitTwo = limitTwo + ((limitTwo * 120) / 100);
                System.out.println("Мы готовы выдать вам кредитную карту с лимитом: " + limitTwo + " рублей.");
            } else if (salary >= 80000) {
                limitTwo = ((limitTwo * 150) / 100) + limitTwo;
                System.out.println("Мы готовы выдать вам кредитную карту с лимитом: " + limitTwo + " рублей.");
            } else {
                System.out.println("Мы готовы выдать вам кредитную карту с лимитом: " + limitTwo + " рублей.");

            }
        }

        System.out.println(" ");
        //task7

        int ageClient = 25; //возраст заемщика
        float termOfCredit = 12f; //срок кредита
        float salaryClient = 60_000f;//зарплата заемщка
        float wantedSum = 330_000f; //размер займа
        float monthlyPayment; //ежемесячный платеж
        float monthlyPaymentMax = salaryClient / 2f;//максимльный ежемесячный платеж
        float interestRate = 10.0f; //процентная ставка

        if (ageClient < 23) {
            interestRate = (interestRate + 1);
            monthlyPayment = (int) Math.round((wantedSum / termOfCredit) + ((wantedSum / interestRate) / termOfCredit));
        } else if (ageClient < 30) {
            interestRate = (float) (interestRate + 0.5);
            monthlyPayment = (int) Math.round((wantedSum / termOfCredit) + ((wantedSum / interestRate) / termOfCredit));
        }

        if (salaryClient > 80_000) {
            interestRate = (float) (interestRate - 0.7);
            monthlyPayment = (int) Math.round((wantedSum / termOfCredit) + ((wantedSum / interestRate) / termOfCredit));
        } else {
            monthlyPayment = (int) Math.round((wantedSum / termOfCredit) + ((wantedSum / interestRate) / termOfCredit));
        }

        if (monthlyPaymentMax > monthlyPayment) {
            System.out.println("Максимальный платеж при ЗП " + salaryClient + " равен " + monthlyPaymentMax + " рублей. " +
                    "Платеж по кредиту равен " + monthlyPayment + " рублей. Одобрено».");
        } else {
            System.out.println("Максимальный платеж при ЗП " + salaryClient + " равен " + monthlyPaymentMax + " рублей. " +
                    "Платеж по кредиту равен " + monthlyPayment + " рублей. Отказано».");
        }


        //task4
        System.out.println(" ");
        String str = ": ";
        for (int i = 1; i < 31; i++) {
            if (((i % 3) == 0) && ((i % 5) == 0)) {
                System.out.println(i + str + "ping pong");
            } else if ((i % 3) == 0) {
                System.out.println(i + str + "ping");
            } else if ((i % 5) == 0) {
                System.out.println(i + str + "pong");
            } else {
                System.out.println(i + str);
            }
        }


        System.out.println(" ");
        //task5
        int a = 0;
        int b = 1;
        System.out.print(a + " ");
        System.out.print(b + " ");
        for (int one = 1; one <= 8; ++one) {
            int num = a + b;
            a = b;
            b = num;
            System.out.print(b + " ");
        }
    }
}








