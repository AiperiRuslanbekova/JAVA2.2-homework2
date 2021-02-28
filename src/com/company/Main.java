package com.company;

import java.util.Scanner;

public class Main {


    public static void main(String[] args) {

        Car car2 = (Car) createObject("Car");
        Train train2 = (Train) createObject("Train");
        Airplane airplane2 = (Airplane) createObject("Airplane");

        car2.print();
        train2.print();
        airplane2.print();
    }

        public static Object createObject(String className){
            String[] str = getInfo(className);
            switch (className){
                case "Car": Car car = new Car("BMW", "Germany", 8);
                    return car;
                case "Train": Train train = new Train("Strela", 20);
                    return train;
                case "Airplane": Airplane airplane = new Airplane("Boeing 737", "passenger plane", 2015);
                    return airplane;
                default:
                    System.out.println("Ошибка!");
                    return null;
            }
        }


        public static String[] getInfo(String className) {
            String[] str = new String[3];
            Scanner scanner =  new Scanner(System.in);
            System.out.println("Выберите виды траспортов и введите: Car, Train, Airplane ");
            str[0] = scanner.nextLine();
            return str;
        }

    }

