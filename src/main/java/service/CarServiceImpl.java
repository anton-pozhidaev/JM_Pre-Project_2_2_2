package service;

import model.Car;

import java.util.ArrayList;
import java.util.List;

public class CarServiceImpl {

     public static List<Car> getCarsFromCarsList(List<Car> cars, int carsCountForReturn) {
         if (cars.size() == 0 || cars.size() < carsCountForReturn) {
             return cars;
         }
         if (carsCountForReturn <= 0 ) {
             return new ArrayList<>();
         }

         return cars.subList(0, carsCountForReturn);
     }
}
