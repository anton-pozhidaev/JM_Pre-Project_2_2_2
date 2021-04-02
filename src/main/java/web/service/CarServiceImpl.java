package web.service;

import web.model.Car;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CarServiceImpl implements CarService {

    private List<Car> initCarsList = new ArrayList<>();

    {
        initCarsList.add(new Car("Subaru", "Forester", 2020));
        initCarsList.add(new Car("Porshe", "Carrera 991", 2012));
        initCarsList.add(new Car("Skoda", "Kodiaq", 2019));
        initCarsList.add(new Car("Toyota", "Land Cruiser 200", 2018));
        initCarsList.add(new Car("Tesla", "Model X", 2021));
    }

    public List<Car> getCarsFromInitCarsList(Integer carsCount) {
        if (carsCount == null || initCarsList.size() < carsCount) {
            return initCarsList;
        }
        if (carsCount <= 0) {
            return new ArrayList<>();
        }
        return initCarsList.subList(0, carsCount);
    }
}
