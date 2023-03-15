package ru.synergy;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        //Object o = new Scanner(System.in); //к переменной Object можноприсвоить объект любого класса

        //Scanner scanner = null; //инициализация

        //if (o instanceof Scanner)scanner = (Scanner) o; //проверяет класс при преобразовании объекта возвращает true/false

        //if (scanner != null){
        //  scanner.nextInt(); // проверка
        //}

        //Object o1 = new String(); //вкладываем другие типы данных

        //Object o2 = new Integer(15); //вкладываем другие типы данных



        Object[] objects = {10, "Привет", 3.14}; // здесь происходит автоупаковка

        for (Object o : objects){
            if (o instanceof String){
                String s = (String) o;
                System.out.println(s);
            }
        }


        ArrayList numbers = new ArrayList(); //сохраняет Object

        for (int i = 0; i<10; i++){
            numbers.add(i*10); //сохранять в коллекцию числа 10, 20 ...100


        }
        int sum = 0;
        for (Object o : numbers){
            sum = sum + (Integer) o;
        }

        System.out.println(sum);




    }



}
