package com.company;


import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
        /** Car деген класс тузунуз (Id, номер авто)
         Дагы бир класс тузунуз, ал класста машинанын данныйлары сакталат (год выпуска, модель, цена, цвет)
         HashMap тузунуз ключ - машина, маани - машинанын данныйлары
         HashMapти толтуруп кайра entrySet деген методун колдонуп баардык элементтерин консольго чыгарыныз */

        HashMap<Car, CarInfo> cars = new HashMap<>();
        cars.put(new Car(123, 2515), new CarInfo(2000, "Honda", 8000, "Silver"));
        cars.put(new Car(456, 2277), new CarInfo(2016, "Toyota", 6000, "Red"));
        cars.put(new Car(789, 1515), new CarInfo(2001, "Mazda", 4500, "Black"));
        cars.put(new Car(223, 2555), new CarInfo(2014, "BMW", 10000, "Wight"));
        cars.put(new Car(445, 7775), new CarInfo(2008, "Nissan", 8600, "Yellow"));

        for (Map.Entry<Car, CarInfo> a : cars.entrySet()) {
            System.out.println(a.getKey() + " " + a.getValue());
        }
    }
}