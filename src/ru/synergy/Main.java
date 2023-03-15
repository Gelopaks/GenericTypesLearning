package ru.synergy;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Object o = new Scanner(System.in); //к переменной Object можноприсвоить объект любого класса

        Scanner scanner = null; //инициализация

        if (o instanceof Scanner)scanner = (Scanner) o; //проверяет класс при преобразовании объекта возвращает true/false

        if (scanner != null){
            scanner.nextInt(); // проверка
        }

        Object o1 = new String(); //вкладываем другие типы данных

        Object o2 = new Integer(15); //вкладываем другие типы данных



    }
}
