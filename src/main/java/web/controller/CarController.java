package web.controller;

import web.model.Car;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.service.CarService;

import java.util.List;

@Controller
public class CarController {

    @Autowired
    private CarService carService;

    @GetMapping(value = "/cars")
//    public String printCars(@RequestParam(defaultValue = "5") int count, ModelMap model) {
    public String printCars(@RequestParam(required = false) Integer count, ModelMap model) {
        List<Car> carsList = carService.getCarsFromInitCarsList(count);
        model.addAttribute("carsAll", carsList);
        return "cars";
    }
}
