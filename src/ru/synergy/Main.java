package ru.synergy;
import java.util.ArrayList;
import java.util.Scanner;
public class Main {
    public static void main(String[] args){

// Casting
        /*Object o = new Scanner(System.in); //к переменной Object можно присвоить объект любого класса

        //((Scanner) o ).nextInt(); // casting: явное преобразование объекта "o" класса Object
                                    // в объект типа Scanner с использованием его методов
        Object o1 = new String(); //вкладываем другие типы данных
        Object o2 = new Integer(15); //вкладываем другие типы данных

       Scanner scanner = null; //инициализация
         if (o instanceof Scanner)scanner = (Scanner) o; //проверяет класс при преобразовании объекта возвращает true/false

         if (scanner != null){   // проверяет результат преобразования
           scanner.nextInt();  // ждет ввода данных типа Integer и после ввода завершает программу
         }*/
// Array
        /*Object[] objects = {10, "Привет!", 3.14}; // здесь происходит автоупаковка
                                                 // массива с разными типами данных
        for (Object o : objects){  // цикл проверки принадлежности объектов
            if (o instanceof String){ // в массиве к типу данных String
                String s = (String) o;
                System.out.println(s);
            }
        }*/

// ArrayList
        ArrayList<Integer> numbers = new ArrayList(); //сохраняет Object. При объявлении типа данных в Object
                                                      // сохраняется объект с объявленным типом данных,
                                                      // что позволяе исключить проверку и преобразование объектов

        for (int i = 0; i<10; i++){  //сохранять в коллекцию числа 10, 20 ...100
            numbers.add(i*10);
            //numbers.add(i*10.4f);
        }

        //numbers.add(10.4f);

        int sum = 0;
        for (Integer o : numbers){
            sum = sum + (Integer) o;
        }

        System.out.println(sum);

    }

}
/*
*             то, что пишем мы в коде                          то, во что, преобразует компилятор
* ArrayList<Integer> list = new ArrayList<Integer>();              ArrayList = new ArrayList
*list.add(1);                                                      list.add((Integer) 1);
* 
*
*
*
 */