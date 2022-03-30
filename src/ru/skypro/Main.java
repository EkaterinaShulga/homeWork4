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
        int days = deliveryDistance/40 + 1;
        if(deliveryDistance<=20) {
            System.out.println("Потребуются сутки");
        }else{
            System.out.println("Потребуется дней: " + days);
        }

        //task 5
       int monthNumber = 10;
        switch (monthNumber){
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
                System.out.println("Месяца с таким номером нет.");
        }




        }
    }









